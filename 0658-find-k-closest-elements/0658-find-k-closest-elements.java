class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        PriorityQueue<Pair> pq = new PriorityQueue<>((a,b) -> {
            if(a.dist != b.dist){
                return b.dist - a.dist;
            }
            return b.val - a.val;
        });

        int left = 0;
        int right = 0;

        while(right < arr.length){
            pq.offer(new Pair(Math.abs(x-arr[right]),arr[right]));
            right++;
            if(pq.size() > k){
                pq.poll();
            }
        }

        System.out.print(pq.size());

        List<Integer> list = new ArrayList<>();
        while(!pq.isEmpty()){
            list.add(pq.poll().val);
        }

        Collections.sort(list); 
        return list;
    }
    class Pair{
        int dist;
        int val;
        public Pair(int dist,int val){
            this.dist = dist;
            this.val = val;
        }
    }
}