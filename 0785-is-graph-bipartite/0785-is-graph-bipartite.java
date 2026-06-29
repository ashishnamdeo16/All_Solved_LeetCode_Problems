class Solution {
    boolean isbipartite = true;
    public boolean isBipartite(int[][] graph) {
        int[] colors = new int[graph.length];

        Arrays.fill(colors,-1);

        for(int i=0;i<graph.length;i++){
            if(colors[i] == -1){
                dfs(colors,graph,i,0);
            }
        }

        return isbipartite;
    }

    public void dfs(int[] colors,int[][] graph,int node,int currentColor){
        colors[node] = currentColor;
        for(int x : graph[node]){
            if(colors[x] != -1 && currentColor == colors[x]){
                isbipartite = false;
                return;
            }else if(colors[x] == -1){
                dfs(colors,graph,x,1-currentColor);
            }
        }
        return;
    }

}