class Solution {
    int[] px = {0,-1,0,1};
    int[] py = {1,0,-1,0};

    public int minimumEffortPath(int[][] heights) {
        int m = heights.length;
        int n = heights[0].length;
        int[] src = new int[]{0,0};
        int[][] distance = new int[m][n];
        for (int[] row : distance) {
         Arrays.fill(row, Integer.MAX_VALUE);
        }
        distance[0][0] = 0;

        PriorityQueue<Pair> pq = new PriorityQueue<>((a, b) -> a.diff - b.diff);
        pq.offer(new Pair(0,src));
        while(!pq.isEmpty()){
            Pair parent = pq.poll();
            int maxdiff = parent.diff;
            int[] node = parent.nodeCordinates;

            for(int i=0;i<4;i++){
                int ii = node[0] + px[i];
                int jj = node[1] + py[i];
                if(ii < 0 || jj< 0 || ii >= m || jj >= n) continue;
                int newDistance = Math.max(maxdiff,Math.abs(heights[node[0]][node[1]] - heights[ii][jj]));
                if(newDistance < distance[ii][jj]){
                    distance[ii][jj] = newDistance;
                    pq.offer(new Pair(newDistance,new int[]{ii,jj}));
                }
            }
        }
        return distance[m-1][n-1];
    }

    class Pair{
        int diff ;
        int[] nodeCordinates;

        public Pair(int diff,int[] nodeCordinates){
            this.diff = diff;
            this.nodeCordinates = nodeCordinates;
        }
    }
}