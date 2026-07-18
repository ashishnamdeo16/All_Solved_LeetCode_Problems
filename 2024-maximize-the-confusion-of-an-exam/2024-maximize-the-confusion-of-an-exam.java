class Solution {
    public int maxConsecutiveAnswers(String answerKey, int k) {
        int l = 0;
        int r = 0;
        int[] freq = new int[256];
        int maxFreq = Integer.MIN_VALUE; 
        int maxLen = Integer.MIN_VALUE; 

        char[] ans = answerKey.toCharArray();

        while(r < ans.length){
            freq[ans[r]]++;
            maxFreq = Math.max(freq[ans[r]],maxFreq);
            int len = r - l + 1;
            int diff =  len - maxFreq;
            while(diff > k){
                 freq[ans[l]]--;
                 l++;
                 len = r - l + 1;
                 diff =  len - maxFreq;
            }

            len = r - l + 1;
            maxLen = Math.max(maxLen,len);
            r++;
        }

        return maxLen;
    }
}