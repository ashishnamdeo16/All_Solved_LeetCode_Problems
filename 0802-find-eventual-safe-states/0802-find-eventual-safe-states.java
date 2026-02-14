class Solution {
    public List<Integer> eventualSafeNodes(int[][] graph) {
        List<Integer> finalList = new ArrayList<>();
        boolean[] visited = new boolean[graph.length];
        boolean[] currentPath = new boolean[graph.length];
        boolean[] safe = new boolean[graph.length]; 

        for(int i=0;i<graph.length;i++){
            if(dfs(i,visited,currentPath,graph,safe)){
                finalList.add(i);
            }
        }
        return finalList;
    }

    public boolean dfs(int node,boolean[] visited,boolean[] currentPath,int[][]graph,boolean[] safe){
        if (visited[node]) return safe[node];      
        if (currentPath[node]) return false;   
       
        currentPath[node] = true;
        visited[node] = true;

        for(int neighbor : graph[node]){
            if (!dfs(neighbor, visited, currentPath, graph, safe)) {
                currentPath[node] = false;
                safe[node] = false;
                return false;
            }
        }
       
        currentPath[node] = false;
        safe[node] = true;
        return true;
    }
}