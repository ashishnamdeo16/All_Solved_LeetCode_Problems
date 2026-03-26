class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] val = new int[k];
        PriorityQueue<Pair> pq = new PriorityQueue<>((a,b) -> {
            if (a.count != b.count) {
                return b.count - a.count;   
            } else {
                return b.val - a.val;      
            }
        });
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }

        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            pq.offer(new Pair(entry.getValue(),entry.getKey()));
        }

        for (int i = 0; i < k; i++) {
            val[i] = pq.poll().val;
        }
        
        return val;
    }
    class Pair{
        int count;
        int val;
        public Pair(int count, int val){
            this.count = count;
            this.val = val;
        }
    }
}