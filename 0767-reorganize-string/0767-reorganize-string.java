class Solution {
    public String reorganizeString(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }

        PriorityQueue<Pair> pq = new PriorityQueue<>(
            (a,b) -> {
                if(a.freq != b.freq){
                    return b.freq - a.freq;
                }
                return b.val - a.val;
            }
        );

        for(Map.Entry<Character,Integer> entry : map.entrySet()){
            pq.offer(new Pair(entry.getValue(),entry.getKey()));
        }

        int seat = 0;
        StringBuilder res = new StringBuilder();

        while(!pq.isEmpty()){
            Pair p = pq.poll();
            if(seat == 0 || res.charAt(seat - 1) != p.val){
                res.append(p.val);
                seat++;
                p.freq--;
                if(p.freq > 0){
                    pq.offer(new Pair(p.freq,p.val));
                }
            }else{
                if(pq.isEmpty()){
                    return "";
                }
                Pair q = pq.poll();
                res.append(q.val);
                seat++;
                q.freq--;
                if(q.freq > 0){
                    pq.offer(new Pair(q.freq,q.val));
                }
                pq.offer(p);
            }
        }
        return res.toString();

    }

    class Pair{
        int freq ;
        char val;
        public Pair(int freq,char val){
            this.freq = freq;
            this.val = val;
        }
    }
}