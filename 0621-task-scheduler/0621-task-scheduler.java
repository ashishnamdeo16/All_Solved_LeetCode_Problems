class Solution {
    public int leastInterval(char[] tasks, int n) {
        int moc = 1;
        HashMap<Character,Integer> map = new HashMap<>();
        for(char c : tasks){
            map.put(c,map.getOrDefault(c,0)+1);
        }    

        int[] free = new int[26];

        PriorityQueue<Pair> pq = new PriorityQueue<>((a,b) -> b.freq - a.freq);
        for(Map.Entry<Character,Integer> entry : map.entrySet()){
            pq.offer(new Pair(entry.getValue() , entry.getKey()));
            free[entry.getKey() - 'A'] = 1;
        }

        while(!pq.isEmpty()){
            ArrayList<Pair> arr = new ArrayList<>();
            while(!pq.isEmpty()){
                Pair p = pq.poll();
                if(free[p.ch - 'A'] <= moc){
                    if(p.freq > 1){
                        pq.offer(new Pair(p.freq-1,p.ch));
                        free[p.ch - 'A'] = moc + n + 1;
                    }
                    break;
                }else{
                    arr.add(p);
                }
            }
            for(int i=0 ;i<arr.size();i++){
                pq.offer(arr.get(i));
            }
            moc++;
        }
        return moc - 1; 
    }

    class Pair{
        int freq;
        char ch;
        public Pair(int freq,char ch){
            this.ch = ch;
            this.freq =freq;
        }
    }
}