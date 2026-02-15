class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
       List<List<Integer>> graph = new ArrayList<>();
       for(int i=0;i<numCourses;i++){
            graph.add(new ArrayList<>());
       } 

       int[] inOrderDegree = new int[numCourses];

       for(int[] x: prerequisites){
        int u = x[0];
        int v = x[1];
        graph.get(v).add(u);
        inOrderDegree[u]++;
       }

      Queue<Integer> que = new ArrayDeque<>();
       int taken = 0;
    
      for(int k=0;k<numCourses;k++){
        if(inOrderDegree[k] == 0){
            que.offer(k);
        }
      }   

      while(!que.isEmpty()){
        int node = que.poll();
        taken++;
        for(int x : graph.get(node)){
            inOrderDegree[x]--;
            if(inOrderDegree[x] == 0){
                que.offer(x);
            }
        }
      }  

      return taken == numCourses;
    }
}