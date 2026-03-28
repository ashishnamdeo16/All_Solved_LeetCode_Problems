class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        PriorityQueue<Pair> pq = new PriorityQueue<>((a,b) ->
            {
                if(a.dist != b.dist){
                    return b.dist - a.dist;
                }
                return b.val - a.val;
            }
        );
        for(int i=0;i<arr.length;i++){
            int dist = Math.abs(arr[i] - x);
            pq.offer(new Pair(dist,arr[i]));
            if(pq.size() > k){
                pq.poll();
            }
        } 

        List<Integer> ans = new ArrayList<>();
        while (!pq.isEmpty()) {
            ans.add(pq.poll().val);
        }

        Collections.sort(ans); 
        return ans;
    }

    class Pair{
        int dist;
        int val;

        public Pair(int dist, int val){
            this.dist = dist;
            this.val = val;
        }
    }
}