class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();

        //Getting All the Frequencies of Numbers in nums
        for(int x : nums){
            map.put(x,map.getOrDefault(x,0)+1);
        }

        PriorityQueue<Pair> pq = new PriorityQueue<>(
            (a,b) -> Integer.compare(a.freq, b.freq)
        );

        for(Map.Entry<Integer,Integer> x : map.entrySet()){
            pq.add(new Pair(x.getValue(),x.getKey()));
            if(pq.size() > k){
                pq.poll();
            }
        }

        int[] arr = new int[k];

        for(int i = arr.length - 1;i>=0;i--){
            Pair p = pq.poll();
            arr[i] = p.val;
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