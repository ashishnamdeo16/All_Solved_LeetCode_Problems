class Solution {
    int[] px = {0,1,0,-1};
    int[] py = {1,0,-1,0};

    public int numIslands(char[][] grid) {
        int res = 0;
        int m = grid.length;
        int n = grid[0].length;

        boolean[][] visited = new boolean[m][n];

        for (int i = 0; i < m; i++) {
          Arrays.fill(visited[i], false);
        }

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j] == '1' && visited[i][j] == false){
                    dfs(grid,m,n,i,j,visited);
                    res++;
                }
            }
        }
        
        return res;
    }

    public void dfs(char[][] grid,int m,int n,int i,int j,boolean[][] visited){
        
        visited[i][j] = true;

        for(int k=0;k<4;k++){
            int x = px[k] + i;
            int y = py[k] + j;
            if(isValid(x,y,m,n) && !visited[x][y] && grid[x][y] == '1'){
                dfs(grid,m,n,x,y,visited);
            }
        }

    }   

    public boolean isValid(int i,int j,int m,int n){
        if(i < 0 || j < 0 || i >= m || j >= n){
            return false;
        }
        return true;
    }
}