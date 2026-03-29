class Solution {
    public int lastStoneWeight(int[] stones) {
        if(stones.length == 1) return stones[0];
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b) -> b-a );
        for(int x : stones){
            pq.offer(x);
        }

        while(pq.size() > 1){
            int x = pq.poll();
            int y = pq.poll();
            if(x == y){
                continue;
            }
            pq.offer(Math.abs(y-x));
        }
        
        return pq.isEmpty() ? 0 : pq.peek();
    }
}