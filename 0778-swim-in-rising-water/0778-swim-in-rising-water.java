class Solution {
    public int swimInWater(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int low = grid[0][0];
        int high = Integer.MIN_VALUE;
        for(int i =0;i<m;i++){
            for(int j=0;j<n;j++){
                high = Math.max(high,grid[i][j]);
            }
        }

        int res = Integer.MAX_VALUE;
        while(low <= high){
            int mid = low + (high - low) /2;
            if(bfs(mid,m,n,grid)){
                res = Math.min(mid,res);
                high = mid - 1;
            }else{
                low = mid + 1;
            }
        }

        return res;
    }

    public boolean bfs(int time,int m,int n,int[][] grid){
        int[] px = {0,1,0,-1};
        int[] py = {1,0,-1,0};

        Queue<int[]> pq = new ArrayDeque<>();
        
        boolean[][] visited = new boolean[m][n];
        visited[0][0] = true;

        pq.offer(new int[]{0,0});

        while(!pq.isEmpty()){
            int[] p = pq.poll();
            int i = p[0];
            int j = p[1];

            if(i == m -1 && j == n-1){
                return true;
            }

            for(int k=0;k<4;k++){
                int x = i + px[k];
                int y = j + py[k];

                if(isValid(x,y,m,n) && time >= grid[x][y] && !visited[x][y]){
                    visited[x][y] = true;
                    pq.offer(new int[]{x,y});
                }
            }
        }
        return false;
    }

    public boolean isValid(int i,int j, int m,int n){
        if(i < 0 || j<0 || i >= m || j >= n ) {
            return false;
        }

        return true;
    }

}