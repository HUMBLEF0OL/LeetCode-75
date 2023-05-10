class Solution {
    public boolean increasingTriplet(int[] nums) {
        if(nums.length < 3) return false;
        int smallest = Integer.MAX_VALUE;
        int mid = Integer.MAX_VALUE;
        for(int i : nums){
            if(i <= smallest) smallest = i;
            else if(i <= mid) mid = i;
            else return true;
        }
        return false;
    }
}