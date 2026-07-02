class Solution {
    int[] px = {0,1,0,-1};
    int[] py = {1,0,-1,0};
    public int minimumEffortPath(int[][] heights) {
        int m = heights.length;
        int n = heights[0].length;
       int[][] distance = new int[m][n];

       for(int i=0;i<m;i++){
        Arrays.fill(distance[i],Integer.MAX_VALUE);
       }

        distance[0][0] = 0;
        PriorityQueue<Pair> pq = new PriorityQueue<>((a,b) -> a.dis - b.dis);
        pq.offer(new Pair(0,new int[]{0,0}));

        while(!pq.isEmpty()){
            Pair p = pq.poll();
            int currNodeDis = p.dis;
            int[] currNodeCoordinate = p.coordinates;
            int cx = currNodeCoordinate[0];
            int cy = currNodeCoordinate[1];

            for(int i=0;i<4;i++){
                int x = px[i] + cx;
                int y = py[i] + cy;

            if(isValid(x,y,m,n)){
                int newDis = Math.max(currNodeDis,Math.abs(heights[cx][cy] - heights[x][y]));
                if(newDis < distance[x][y]){
                      distance[x][y] = newDis;
                        pq.offer(new Pair(newDis,new int[]{x,y}));
                }
            }
            }
        }
                    return distance[m-1][n-1];

    }

    class Pair{
        int dis;
        int[] coordinates;

        public Pair(int dis,int[] coordinates){
            this.dis = dis;
            this.coordinates = coordinates;
        }
    }

    public boolean isValid(int i,int j,int m,int n){
        if(i < 0 || j < 0 || i>=m || j >= n){
            return false;
        }
        return true;
    }
}