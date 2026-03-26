class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        HashMap<String,Integer> map = new HashMap<>();
        for(String s : words){
            map.put(s,map.getOrDefault(s,0)+1);
        }

        PriorityQueue<Pair> pq = new PriorityQueue<>((a,b) -> {
            if(a.count != b.count){
                return a.count - b.count;
            }
            return b.val.compareTo(a.val);
        });

        for(Map.Entry<String,Integer> entry : map.entrySet()){
            pq.offer(new Pair(entry.getValue(), entry.getKey()));

            if (pq.size() > k) {
                pq.poll(); 
            }
        }

       List<String> list = new ArrayList<>();
        for(int j = k-1;j>=0 ;j--){ 
           list.add(pq.poll().val);
        }

        Collections.reverse(list);

        return list;
    }

    class Pair{
        String val;
        int count;
        public Pair(int count,String val){
            this.count = count;
            this.val = val;
        }
    }
}