class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i:arr){
        	map.put(i,1+map.getOrDefault(i,0));
        }
        // if all the element values are unique then return true otherwise we can say that 2 elements have same number of repetitions hence can return false
        Set<Integer> set = new HashSet<>(map.values());
        return map.size() == set.size();
    }
}