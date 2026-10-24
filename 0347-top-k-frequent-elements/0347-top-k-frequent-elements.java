class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();

        for(int x : nums){
            map.put(x,map.getOrDefault(x,0)+1);
        }

        PriorityQueue<Pair> pq = new PriorityQueue<>((a,b) -> a.freq - b.freq);

        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            pq.offer(new Pair(entry.getValue(),entry.getKey()));
            if(pq.size() > k){
                pq.poll();
            }
        }

        int[] arr = new int[k];
        int l = 0;

        while(!pq.isEmpty()){
            arr[l++] = pq.poll().val;
        }

        return arr;
    
    }

    class Pair{
        int freq;
        int val;

        public Pair(int freq,int val){
            this.freq = freq;
            this.val = val;
        }
    }
}