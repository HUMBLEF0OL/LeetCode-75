class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i : arr){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        HashSet<Integer> set = new HashSet<>();
        for(int keys : map.keySet()){
            if(set.contains(map.get(keys)))return false;
            set.add(map.get(keys));
        }
        return true;
    }
}