class Solution {
    public String[] findRelativeRanks(int[] score) {
        PriorityQueue<Pair> pq = new PriorityQueue<>((a,b) ->  b.score - a.score);
        for(int x =0;x<score.length;x++){
            pq.offer(new Pair(score[x],x));
        }

        String[] arr = new String[score.length];
        int j = 0;

        while(!pq.isEmpty()){
            Pair p = pq.poll();
            if(j == 0){
                arr[p.index] = "Gold Medal";
            }else if(j == 1){
                 arr[p.index] = "Silver Medal";
            }else if(j == 2){
                 arr[p.index] = "Bronze Medal";
            }else{
                int k = j+1;
                arr[p.index] = "" + k;
            }
            j++;
        }

        return arr;
    }

    class Pair{
        int score;
        int index;
        public Pair(int score,int index){
            this.score = score;
            this.index =index; 
                   }
    }
}