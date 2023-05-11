class Solution {
    public void moveZeroes(int[] nums) {
        if(nums.length == 0)return;
        int zeroPointer = 0;
        int nonZeroPointer = 0;
        for(int i =0;i<nums.length;i++){
            if(nums[i] != 0){
                int temp = nums[zeroPointer];
                nums[zeroPointer] = nums[i];
                nums[i] = temp;
                zeroPointer++;
            }
        }
    }
}