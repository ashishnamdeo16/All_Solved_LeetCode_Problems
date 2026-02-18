class Solution {
    int[] px = {0,-1,0,1};
    int[] py = {-1,0,1,0};
    int time = 0;

    public int orangesRotting(int[][] grid) {
        int fresh = 0;
        Queue<Pair> que = new ArrayDeque<>();
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j] == 2){
                    que.offer(new Pair(i,j));
                }else if(grid[i][j] == 1){
                    fresh++;
                }
            }
        }

        if (fresh == 0) return 0;

        while(!que.isEmpty()){
            int size = que.size();
            boolean isChanged = false;
            for(int c =0 ;c< size;c++){
                Pair newPair = que.poll();
            for(int k=0;k<4;k++){
                int ii = newPair.x + px[k];
                int jj = newPair.y + py[k];
                if(ii<0 || jj <0 || jj>= grid[0].length || ii >= grid.length || grid[ii][jj] != 1){
                    continue;
                }
                que.offer(new Pair(ii,jj));
                grid[ii][jj] = 2;
                fresh--;
                isChanged = true;
            }
            }
            if(isChanged) time++;
        }
        return fresh != 0 ? -1 : time;
    }

    public class Pair{
        int x;
        int y;
        public Pair(int x,int y){
            this.x = x;
            this.y = y;
        }
    }
}