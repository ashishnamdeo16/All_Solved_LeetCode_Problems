class Solution {
    int[] px = {0,1,0,-1};
    int[] py = {1,0,-1,0};

    public int numIslands(char[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        boolean[][] visited = new boolean[m][n];
        int island = 0;

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j] == '1' && !visited[i][j]){
                    dfs(grid,visited,i,j,m,n); 
                    island++;
                }
            }
        }

        return island;
    }

    public void dfs(char[][] grid,  boolean[][] visited,int i,int j,int m,int n){
        visited[i][j] = true;
        
        for(int k=0;k<4;k++){
            int x = i + px[k];
            int y = j + py[k];
            if(isValid(x,y,m,n) && !visited[x][y] && grid[x][y] == '1'){
                 dfs(grid,visited,x,y,m,n); 
            }
        }

        return;
    }

    public boolean isValid(int i,int j,int m,int n){
        if(i < 0 || j< 0 || i >= m || j >= n){
            return false;
        }
        return true;
    }
}