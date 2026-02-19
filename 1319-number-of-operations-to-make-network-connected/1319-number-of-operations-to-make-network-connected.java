class Solution {
    public int makeConnected(int n, int[][] connections) {
        int noOfComponents = 0;
        if(connections.length < n-1){
            return -1;
        }
        
        List<List<Integer>> graph = new ArrayList<>();

        for(int i=0;i<n;i++){
            graph.add(new ArrayList<>());
        }

        for(int[] x : connections){
            int u = x[0];
            int v = x[1];
            graph.get(u).add(v);
            graph.get(v).add(u);
        }

        boolean[] visited = new boolean[n];

        for(int j=0;j<n;j++){
            if(!visited[j]){
                dfs(j,graph,visited);
                noOfComponents++;
            }
        }

        int req = noOfComponents - 1;
        return req;
    }

    public void dfs(int node, List<List<Integer>>  graph,boolean[] visited){
        visited[node] = true;

        for(int x : graph.get(node)){
            if(!visited[x]){
                dfs(x,graph,visited);
            }
        }
    }
}