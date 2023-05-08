class Solution {
    public int[] productExceptSelf(int[] nums) {
        int overallProduct = 1;
        int numberOfZeroes = 0;
        for(int number : nums){
            if(number == 0){
                ++numberOfZeroes;
                if(numberOfZeroes > 1){
                    overallProduct = 0;
                } else{
                    continue;
                }
            } else{
                overallProduct *= number;
            }
        }
        int result[] = new int[nums.length];
        for(int i =0;i<nums.length;i++){
            if(overallProduct == 0){
                result[i] = 0;
            } else{
                if(nums[i] == 0){
                    result[i] = overallProduct;
                } else{
                    if(numberOfZeroes>0){
                        result[i] = 0;
                    } else{
                        result[i] = overallProduct/nums[i];   
                    }
                    
                }
                
            }
        }
        return result;
    }
}