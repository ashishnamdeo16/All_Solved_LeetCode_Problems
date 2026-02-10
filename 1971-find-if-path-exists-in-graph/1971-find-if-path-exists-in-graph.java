class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        if(source == destination) return true;
        List<Integer>[] graph = new ArrayList[n];
        for(int i=0;i<n;i++){
            graph[i] = new ArrayList<>();
        }

        for(int[] x: edges){
            int u = x[0];
            int v = x[1];
            graph[u].add(v);
            graph[v].add(u); 
        }

        Queue<Integer> que = new ArrayDeque<>();
        Set<Integer> visited = new HashSet<>();
        que.offer(source);
        visited.add(source);

        while(!que.isEmpty()){
            int node = que.poll();
            for(int x : graph[node]){
                if(!visited.contains(x)){
                    if(x == destination) return true;
                     que.offer(x);
                     visited.add(x);
                }
            }
        }

        return false;
    }
}