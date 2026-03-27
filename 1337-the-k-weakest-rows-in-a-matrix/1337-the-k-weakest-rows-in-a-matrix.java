class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        PriorityQueue<Pair> pq = new PriorityQueue<>((a,b) -> { 
            if(b.soldierCount != a.soldierCount){
                return b.soldierCount - a.soldierCount;
            }
            return b.index - a.index;
            });

        for(int i=0;i<mat.length;i++){
            int count = 0;
            int j = 0;
            while(j < mat[0].length){
                if(mat[i][j] == 1){
                    count++;
                }
                j++;
            }
            pq.offer(new Pair(count,i));
            if(pq.size() > k){
                pq.poll();
            }
        }    

        int[] arr = new int[k];
        int l = k-1;
        
        while(!pq.isEmpty()){
            arr[l--] = pq.poll().index;
        }
        
        return arr;
    }
    class Pair{
        int soldierCount;
        int index;
        public Pair(int soldierCount, int index){
            this.soldierCount = soldierCount;
            this.index = index;
        }
    }
}