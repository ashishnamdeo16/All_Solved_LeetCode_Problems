class Solution {
    public int countComponents(int n, int[][] edges) {
        List<List<Integer>> graph = new ArrayList<>();
        for(int i=0;i<n;i++){
            graph.add(new ArrayList<>());
        }

        for(int i=0;i<edges.length;i++){
            int u = edges[i][0];
            int v = edges[i][1];

            graph.get(u).add(v);
            graph.get(v).add(u);
        }

        boolean[] visited = new boolean[n];
        int count = 0;

        for(int i=0;i<n;i++){
            if(!visited[i]){
                dfs(i,graph,visited);
                count++;
            }
        }
        return count;
    }

    public void dfs(int i,List<List<Integer>> graph,boolean[] visited){
        visited[i] = true;
        for(int x : graph.get(i)){
            if(!visited[x]){
                dfs(x,graph,visited);
            }
        }
    }   
}