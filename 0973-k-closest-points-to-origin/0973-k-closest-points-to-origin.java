class Solution {
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<Pair> pq = new PriorityQueue<>((a,b) -> b.dist - a.dist);    

        for(int i =0 ;i<points.length;i++){
            int dist = points[i][0] * points[i][0]  + points[i][1]  * points[i][1];
            pq.offer(new Pair(dist,i));
            if(pq.size() > k){
                pq.poll();
            }
        }

        int[][] arr = new int[k][2];
        int val = 0;

        while(!pq.isEmpty()){
            Pair left = pq.poll();
            arr[val] = points[left.index];
            val++;
        }

        return arr;

    }
    class Pair{
        int dist;
        int index;
        public Pair(int dist,int index){
            this.dist = dist;
            this.index= index;
        }
    }
}