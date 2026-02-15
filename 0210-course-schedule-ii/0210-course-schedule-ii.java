class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        List<List<Integer>> graph = new ArrayList<>();
        for(int i=0;i<numCourses;i++){
            graph.add(new ArrayList<>());
        }

        for(int[] x : prerequisites){
            int u = x[0];
            int v = x[1];
            
            graph.get(v).add(u);
        }

        List<Integer> ans = new ArrayList<>();
        boolean[] visited = new boolean[numCourses];
        boolean[] currentPath = new boolean[numCourses];
        
        for(int k=0;k<numCourses;k++){
            if(!visited[k]){
                if(dfs(k,visited,ans,graph,currentPath)){
                    return new int[]{};
                }
            }
        }
        return ans.stream().mapToInt(i -> i).toArray();
    }

    public boolean dfs(int node,boolean[] visited,List<Integer> ans,List<List<Integer>> graph,boolean[] currentPath){
        visited[node] = true;
        currentPath[node] = true;
        for(int x:graph.get(node)){
            if(currentPath[x]) return true;
            if(!visited[x]){
                if(dfs(x,visited,ans,graph,currentPath)) return true;
            }
        }
        currentPath[node] = false;
        ans.add(0,node);
        return false;
    }
}