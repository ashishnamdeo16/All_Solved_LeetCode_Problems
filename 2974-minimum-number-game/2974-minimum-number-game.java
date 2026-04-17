class Solution {
    public int[] numberGame(int[] nums) {
        
      PriorityQueue<Integer> pq = new PriorityQueue<>();
      int[] arr = new int[nums.length];

      for(int x : nums){
           pq.offer(x);
      }  

      int i = 0;

      while(!pq.isEmpty()){
          int p = pq.poll();
          arr[i++] = pq.poll();
          arr[i++] = p;
      }  

      return arr;
    }
}