class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        HashSet<Integer> setOfFirst = new HashSet<>();
        HashSet<Integer> setOfSecond = new HashSet<>();
        
        for(int i : nums1){
            setOfFirst.add(i);
        }
        for(int i : nums2){
            setOfSecond.add(i);
        }
        List<Integer> uniqueOfSecond = new ArrayList<>();
        for(Integer i: setOfSecond){
            if(setOfFirst.contains(i)){
                setOfFirst.remove(i);
            } else{
                uniqueOfSecond.add(i);
            }
        }
        List<Integer> uniqueOfFirst = new ArrayList<>();
        for(Integer i: setOfFirst){
            uniqueOfFirst.add(i);
        }
        List<List<Integer>> output = new ArrayList<>();
        output.add(uniqueOfFirst);
        output.add(uniqueOfSecond);
        return output;
    }
}