class Solution {
    static int[][] dir={{1,0},{-1,0},{0,1},{0,-1}};
    public int orangesRotting(int[][] grid) {
        int freshOranges=0;
        Queue<int[]> q=new ArrayDeque<>();
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==1){
                    freshOranges++;
                }else if(grid[i][j]==2){
                    q.add(new int[]{i,j});
                }
            }
        }
        int level=0;
        while(q.size()>0){
            int size=q.size();
            while(size-->0){
                int[] ro=q.remove();
                for(int i=0;i<4;i++){
                    int r=ro[0]+dir[i][0];
                    int c=ro[1]+dir[i][1];
                    if(r<0 || r>=grid.length || c<0 || c>=grid[0].length || grid[r][c]!=1){
                        continue;
                    } 
                    grid[r][c]=2;
                    freshOranges--;
                    q.add(new int[]{r,c});  
                }
            }
            if(q.size()!=0){
                level++;
            }
        }
        if(freshOranges==0){
            return level;
        }else{
            return -1;
        }
    }
}