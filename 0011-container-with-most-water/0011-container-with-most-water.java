class Solution {
    public int maxArea(int[] height) {
        int i =0,j = height.length-1;
        int result = 0;
        while(i<j){
            int currentArea = 0;
            
            if(height[i] < height[j]){
                currentArea = height[i]*(j-i);
                i++;
            } else{
                currentArea = height[j]*(j-i);
                j--;
            }
            result = Math.max(currentArea,result);
        }
        return result;
    }
}