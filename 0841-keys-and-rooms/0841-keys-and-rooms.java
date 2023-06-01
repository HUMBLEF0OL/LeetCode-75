class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        Queue<Integer> q = new LinkedList<>();
        HashSet<Integer> set = new HashSet<>();
        q.add(0);
        set.add(0);
        
        while(q.size()>0){
            int current = q.remove();
            for(int key : rooms.get(current)){
                if(!set.contains(key)){
                    set.add(key);
                    q.add(key);
                }
            }
            if(set.size() == rooms.size())return true;
        }
        return set.size() == rooms.size();
    }
}