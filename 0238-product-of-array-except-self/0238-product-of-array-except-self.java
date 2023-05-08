class Solution {
    public int[] productExceptSelf(int[] nums) {
        int productOverall = 1;
        int numberOfZeroes = 0;
        for(int number:nums) {
            if(number == 0) {
                numberOfZeroes++;
                continue;
            }
            productOverall *=number;
        }
        for(int i =0;i<nums.length;i++) {
            if(nums[i] == 0 && numberOfZeroes>1)
                nums[i] = 0;
            else if(nums[i] == 0 && numberOfZeroes == 1)
                nums[i] = productOverall;
            else if(nums[i]!=0 && numberOfZeroes>=1)
                nums[i] = 0;
            else nums[i] = productOverall/nums[i];
        }
        return nums;
    }
}