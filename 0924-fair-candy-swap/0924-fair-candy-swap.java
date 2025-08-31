class Solution {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int i =0;
        int j =0;
        int sumA=0;
        int sumB =0;
        while(i<aliceSizes.length){
            sumA+= aliceSizes[i];
            i++;
        }
         while(j<bobSizes.length){
            sumB+= bobSizes[j];
            j++;
        }
        j=0;
        int diff = (sumA-sumB)/2;
        while(j<bobSizes.length){
            int x = bobSizes[j] + diff;
            for(int k=0;k<aliceSizes.length;k++){
                if(x == aliceSizes[k]){
                    return new int[]{aliceSizes[k],bobSizes[j]};
                }
            }  
            j++;          
        }
        return new int[]{-1,-1};
    }
}