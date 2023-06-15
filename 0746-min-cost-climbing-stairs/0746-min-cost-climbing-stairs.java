class Solution {
    // using top down approach
    private int rHelper(int cost[],int dp[],int n)
    {
        // base case
        if(n<0)
            return 0;
        if(n == 0|| n == 1)
            return cost[n];
        // if we already know the answer
        if(dp[n]!=0)
            return dp[n];
        dp[n] = cost[n]+Math.min(rHelper(cost,dp,n-1),rHelper(cost,dp,n-2));
        return dp[n];
    }
    public int minCostClimbingStairs(int[] cost) {
        int dp[] = new int[cost.length];
        dp[0] = cost[0];
        dp[1]  = cost[1];
        for(int i =2;i<cost.length;i++){
            dp[i] = cost[i] + Math.min(dp[i-1],dp[i-2]);
        }
        return Math.min(dp[dp.length-1],dp[dp.length-2]);
        // return Math.min(rHelper(cost,dp,cost.length-1),rHelper(cost,dp,cost.length-2));
    }
}