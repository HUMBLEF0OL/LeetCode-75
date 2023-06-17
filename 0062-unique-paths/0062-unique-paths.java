class Solution {
    public static int uniquePaths(int m, int n) {
        int[][] arr = new int[m+1][n+1];
        arr[1][1]=1;
        for (int i = 0; i <= m; i++) {
            for (int j = 0; j <= n; j++) {
                if(j+1<=n) arr[i][j+1]+=arr[i][j];
                if(i+1<=m) arr[i+1][j]+=arr[i][j];
            }
        }
        return arr[m][n];
    }
}