class Solution {
    int[] px = {0,1,0,-1};
    int[] py = {1,0,-1,0};
    public void solve(char[][] board) {
        int m = board.length;
        int n = board[0].length;

        boolean[][] visited = new boolean[m][n];
        for(int i=0;i<m;i++){
            Arrays.fill(visited[i],false);
        }

        for(int i=0;i<m;i++){
                 if(board[i][0] == 'O' && !visited[i][0]){
                    dfs(i,0,m,n,board,visited);
                }
        }

         for(int j=0;j<n;j++){
                 if(board[0][j] == 'O' && !visited[0][j]){
                    dfs(0,j,m,n,board,visited);
                }
        }


        for(int i=0;i<m;i++){
                 if(board[i][n-1]=='O' && !visited[i][n-1]){
                    dfs(i,n-1,m,n,board,visited);
                }
        }

            for(int j=0;j<n;j++){
                if(board[m-1][j]=='O' && !visited[m-1][j]){
               dfs(m-1,j,m,n,board,visited);
              }
            }
        
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(board[i][j] == 'O' && !visited[i][j]){
                    board[i][j] = 'X';
                }
            }
        }
    }

    public void dfs(int i,int j,int m,int n,char[][] board,boolean[][] visited){
        visited[i][j] = true;

        for(int k=0;k<4;k++){
            int x = px[k] + i;
            int y = py[k] + j;
            if(isValid(x,y,m,n) && board[x][y] == 'O' && !visited[x][y]){
                 dfs(x,y,m,n,board,visited);
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