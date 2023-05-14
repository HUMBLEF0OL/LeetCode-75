class Solution {
    public int longestSubarray(int[] nums) {
        int i = 0, j = 0;
        int zeroCount = 1;
        int result = 0;
        while (i < nums.length) {
            if (nums[i] == 0)
                zeroCount--;

            if (zeroCount < 0) {
                while (zeroCount < 0) {
                    if (nums[j] == 0)
                        zeroCount++;
                    j++;
                }
            }
            result = Math.max(result, i - j);
            i++;
        }
        return result;
    }
}