class Solution {
    public int networkDelayTime(int[][] times, int n, int k) {
        List<List<int[]>> graph = new ArrayList<>();

        for(int i=0;i<n;i++){
            graph.add(new ArrayList<>());
        }

        for(int[] x : times){
            int u = x[0] - 1;
            int v = x[1] - 1;
            int wt = x[2];

            graph.get(u).add(new int[]{v,wt});
        }

        int[] distance = new int[n];
        Arrays.fill(distance,Integer.MAX_VALUE);

        PriorityQueue<Pair> pq = new PriorityQueue<>((a,b) -> a.wt - b.wt);
        distance[k-1] = 0;
        pq.offer(new Pair(0,k-1));

        while(!pq.isEmpty()){
            Pair p = pq.poll();
            int node = p.d;
            int d = p.wt;

            if(d > distance[node]){
                continue;
            }

            for(int[] x : graph.get(node)){
                 int neigh = x[0];
                 int wt = x[1];
                if(d + wt < distance[neigh]){
                    pq.offer(new Pair(d+wt,neigh));
                    distance[neigh] = d+wt;
                }   
            }   

        }
        int maxTime = 0;

    for (int x : distance) {
        if (x == Integer.MAX_VALUE) {
         return -1;
        }
    maxTime = Math.max(maxTime, x);
    }

return maxTime;

    }

    class Pair{
        int wt;
        int d;

        public Pair(int wt,int d){
            this.wt = wt;
            this.d = d;
        }
    }
}