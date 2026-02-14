class Solution {
    int longestCycle = -1;
    int step = 0;
    public int longestCycle(int[] edges) {
        int n = edges.length;
        boolean[] visited = new boolean[n];
        boolean[] inStack = new boolean[n];
        int[] counterArray = new int[n];

        Arrays.fill(counterArray,-1);

        for(int i=0;i<n;i++){
            if(!visited[i]){
                dfs(i ,edges,visited,inStack,counterArray);
            }
        }
        return longestCycle;
    }

    public void dfs(int node,int[] edges,boolean[] visited,boolean[] inStack ,int[] counterArray){
        visited[node] = true;
        inStack[node] = true;
        counterArray[node] = step++;

        int neighbor = edges[node];
        if(neighbor != -1){
            if(!visited[neighbor]){
               dfs(neighbor,edges,visited,inStack,counterArray);
            }else if(inStack[neighbor]){
                int cycleLen = counterArray[node] - counterArray[neighbor] + 1;
                longestCycle = Math.max(cycleLen,longestCycle);
            }
        }
       
       //BackTrack
        inStack[node] = false;
        counterArray[node] = -1;
    }
}