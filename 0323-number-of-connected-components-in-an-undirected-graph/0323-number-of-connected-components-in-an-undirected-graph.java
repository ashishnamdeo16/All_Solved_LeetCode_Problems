class Solution {
    public int countComponents(int n, int[][] edges) {
    ArrayList<List<Integer>> graph = new ArrayList<>();

    for(int i=0;i<n;i++){
        graph.add(new ArrayList<>());
    }

    for(int[] x : edges ){
        int u = x[0];
        int v = x[1];

        graph.get(u).add(v);
        graph.get(v).add(u);
    }

    boolean[] visited = new boolean[n];

    int count = 0;

    for(int i=0;i<graph.size();i++){
        if(!visited[i]){
            dfs(graph,visited,i);
            count++;
        }
    }

    return count;
    }
    
    public void dfs( List<List<Integer>> graph, boolean[] visited,int node){
        visited[node] = true;

        for(int x : graph.get(node)){
            if(!visited[x]){
                dfs(graph,visited,x);
            }
        }
        return;
    }
}