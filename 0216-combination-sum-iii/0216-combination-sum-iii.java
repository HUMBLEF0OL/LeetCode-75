class Solution {

    private void helper(int startIndex, List<Integer> list, List<List<Integer>> result, int k, int sum) {
        if (k == 0 && sum == 0) {
            result.add(new ArrayList<>(list));
            return;
        }

        for (int j = startIndex; j < 10; j++) {
            list.add(j);
            helper(j + 1, list, result, k-1, sum-j);
            list.remove(list.size() - 1);
        }
    }
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> result = new ArrayList<>();
        
        if (n <= k || n > 55) return result;
        
        helper(1, new ArrayList<>(), result, k, n);
        return result;
    }
}