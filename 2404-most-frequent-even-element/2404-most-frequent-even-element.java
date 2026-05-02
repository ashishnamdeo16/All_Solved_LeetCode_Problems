class Solution {
    public int mostFrequentEven(int[] nums) {
        int[] freq = new int[100001];
        for(int x : nums){
            if(x % 2 == 0){
                freq[x]++;
            }
        }

        int max = Integer.MIN_VALUE;
        int res = -1;

        for(int i=0;i<freq.length;i++){
            if(i%2 == 0 && freq[i] > 0){
                if(max < freq[i]){
                    max = freq[i];
                    res = i; 
                }
             }
        }

        return res;
        }
    }