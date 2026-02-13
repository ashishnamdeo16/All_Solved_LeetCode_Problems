class Solution {
    public int minReorder(int n, int[][] connections) {
        List<List<Integer>> graph = new ArrayList<>();
         List<Set<Integer>> forward = new ArrayList<>();

        for (int i = 0; i < n; i++) {
             graph.add(new ArrayList<>());
        }

        for (int i = 0; i < n; i++) forward.add(new HashSet<>());

        for(int[] x : connections){
            int u = x[0];
            int v = x[1];

            graph.get(u).add(v);
            graph.get(v).add(u);

            forward.get(u).add(v);
        }

        boolean[] visited = new boolean[n];
        return dfs(0,graph,forward,visited);
    }

    public int dfs(int node, List<List<Integer>> undirectedGraph,List<Set<Integer>> forward,boolean[] visited){
            visited[node] = true;
            int changes = 0;
            for(int x : undirectedGraph.get(node)){
                if(!visited[x]){
                    if(forward.get(node).contains(x)) changes++;
                    changes += dfs(x,undirectedGraph,forward,visited);
                }
            }
            return changes;
    }

}