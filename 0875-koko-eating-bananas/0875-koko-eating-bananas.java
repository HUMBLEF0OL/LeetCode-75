class Solution {
    public int findMax(int [] piles)
    {
        int max = 0;
        for(int i : piles)
            max = Math.max(max,i);
        return max;
    }
    public boolean canEat(int piles[], int k,int hours)
    {
        int totalHours = 0;
        for(int i : piles)
            totalHours += (i-1)/k + 1;
        //(pile - 1) / speed + 1 because we need total time koko
        //will spend on a pile having(say) 10 bananas, if her eating 
        //speed were 3. It would be 4.
        return totalHours <= hours;
    }
    public int minEatingSpeed(int[] piles, int h) {
        //finding the maximum number of banana that she can eat in an hour
        int right = findMax(piles);
        int left = 1;
        while(left<right)
        {
            int mid = (right+left)/2;
            if(canEat(piles,mid,h))
                right = mid;
            else
                left = mid + 1; 
        }
        return right;
    }
}