class Solution {
    public int characterReplacement(String s, int k) {
       int right = 0;
       int left = 0;

        int res = Integer.MIN_VALUE;
        int[] freq = new int[256];

        while(right < s.length()){
            freq[s.charAt(right)]++;

            int len = right - left + 1;
            int maxElement = getMax(freq);
            int diff = len - maxElement;

            while(diff > k){
                freq[s.charAt(left)]--;
                left++;
                len = right - left + 1;
                maxElement = getMax(freq);
                diff = len - maxElement;
            }

            res = Math.max(res,right - left + 1 );
            right++;
        }

        return res;
    }

    public int getMax(int[] freq){
        int max = Integer.MIN_VALUE;
        for(int i=0;i<freq.length;i++){
            max = Math.max(max,freq[i]);
        }
        return max;
    }
}