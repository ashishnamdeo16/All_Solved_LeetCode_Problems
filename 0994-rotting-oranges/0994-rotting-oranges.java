class Solution {
    int time = 0;
    int[] px = {0,1,0,-1};
    int[] py = {1,0,-1,0};
    public int orangesRotting(int[][] grid) {

       int m = grid.length;
       int n = grid[0].length;
       Queue<Pair> pq = new ArrayDeque<>();

       int freshOranges = 0;

        for(int i=0;i<m;i++){
            for(int j = 0;j<n;j++){
                if(grid[i][j] == 1){
                    freshOranges++;
                }else if(grid[i][j] == 2){
                    pq.offer(new Pair(i,j));
                    grid[i][j] = 0;
                }
            }
        }

        while(!pq.isEmpty() && freshOranges > 0){
            time++;
            int size = pq.size();
            for(int i=0;i<size;i++){
                Pair p = pq.poll();
                for(int k=0;k<4;k++){
                    int x = px[k]+p.i;
                    int y = py[k]+p.j;
                    if(isValid(x,y,m,n) && grid[x][y] == 1){
                        pq.offer(new Pair(x,y));
                        grid[x][y] = 0;
                        freshOranges--;
                    }
                }
            }
        }

        if(freshOranges > 0) return -1;

        return time;
    }

    public boolean isValid(int i,int j,int m,int n){
        if(i < 0 || j<0 || i >= m || j >= n){
            return false;
        }
        return true;
    }

    class Pair{
        int i;
        int j;
        public Pair(int i,int j){
            this.i = i;
            this.j = j;
        }
    }
}