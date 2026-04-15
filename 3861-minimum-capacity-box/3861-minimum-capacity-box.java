class Solution {
    public int minimumIndex(int[] capacity, int itemSize) {
        int res = -1;
        int best = Integer.MAX_VALUE;
        for(int i=0;i<capacity.length;i++){
            if(capacity[i] >= itemSize){
                if(best > capacity[i]){
                    best = capacity[i];
                    res = i;
                }
            }
        }
        return res;
    }
}
