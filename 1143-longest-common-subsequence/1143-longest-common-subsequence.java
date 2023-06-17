class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        // using iterative dynamic programming
        // creating a matrix of size [l1+1][l2+1];
        int dp[][] = new int[text1.length()+1][text2.length()+1];
        for(int i =0;i<dp.length;i++)
        {
            for(int j =0;j<dp[i].length;j++)
            {
                if(i == 0 || j == 0)
                    dp[i][j] = 0;
                else{
                    // we are comparing one index less just to avoid index overflow for text
                    if(text1.charAt(i-1) == text2.charAt(j-1))
                        dp[i][j] = dp[i-1][j-1]+1;
                    else
                        dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
        return dp[dp.length-1][dp[0].length-1];
    }
}