class Solution {
    public String frequencySort(String s) {
       HashMap<Character,Integer> map = new HashMap<>();
       for(char x : s.toCharArray()){
        map.put(x,map.getOrDefault(x,0)+1);
       }
       PriorityQueue<Pair> pq = new PriorityQueue<>((a,b) -> b.count - a.count);
       for(Map.Entry<Character,Integer> entry : map.entrySet()){
        pq.offer(new Pair(entry.getValue(),entry.getKey()));
       }

       StringBuilder sb = new StringBuilder();

       while(!pq.isEmpty()){
            Pair p = pq.poll();
            for(int i=0;i<p.count;i++){
                sb.append(p.ch);
            }
       }

       return sb.toString();

    }
    class Pair{
        int count;
        char ch ;
        public Pair(int count,char ch){
            this.count = count;
            this.ch = ch;
        }
    }
}