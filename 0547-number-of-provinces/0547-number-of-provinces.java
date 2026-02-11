class Solution {
    public int findCircleNum(int[][] isConnected) {
        Set<Integer> visited = new HashSet<>();
        int count = 0;
        for(int i=0;i<isConnected.length;i++){
            int node = i;
            if(!visited.contains(i)){
                count++; 
                bfs(i,isConnected,visited);
            }
        }
        return count;
    }

    public void bfs(int node,int[][] isConnected,Set<Integer> visited){
        Queue<Integer> queue = new ArrayDeque<>();
        queue.offer(node);
        visited.add(node);
        while(!queue.isEmpty()){
            int u =queue.poll();
            for(int i=0;i<isConnected[u].length;i++){
            if(isConnected[u][i] == 1 && !visited.contains(i)){
                queue.offer(i);
                visited.add(i);
            }
        }
        }
    }
}