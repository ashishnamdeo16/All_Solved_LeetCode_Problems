class Solution {
    int count = 0;
    int[] px = {0,-1,0,1};
    int[] py = {-1,0,1,0};

    public int numIslands(char[][] grid) {
        int r = grid.length;
        int c = grid[0].length;
        for(int i=0;i<grid.length;i++){
            for(int j = 0;j<grid[0].length;j++){
                if(grid[i][j] == '1'){
                    dfs(i,j,grid,r,c);
                    count++;
                }
            }
        }

        return count;
    }

    public void dfs(int i,int j,char[][] grid,int r,int c){
        if(i<0 || j <0 || i>=r || j >= c || grid[i][j] != '1'){
            return;
        }

        grid[i][j] = '2';

        for(int k=0;k<4;k++){
            int ii = i + px[k];
            int jj = j + py[k];
            dfs(ii,jj,grid,r,c);
        }
    }
}