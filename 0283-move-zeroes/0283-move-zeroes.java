class Solution {
    public void moveZeroes(int[] nums) {
        // here we will be maintain 2 pointers
		// left and right
		// if  value at right(i) is not zero then swap it with left and increment both of them by 1
        if(nums.length == 0)return;
        int zeroPointer = 0;
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