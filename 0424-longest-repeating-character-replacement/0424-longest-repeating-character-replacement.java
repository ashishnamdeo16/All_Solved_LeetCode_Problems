class Solution {
    public int characterReplacement(String s, int k) {
       int low = 0;
       int high = 0;
       char[] ch = s.toCharArray();
       int longestSubString = Integer.MIN_VALUE;
       int[] freq = new int[256];
       int maxFreq = Integer.MIN_VALUE;
       while(high<ch.length){
            freq[ch[high]]++;
            int len = high - low + 1;
            maxFreq = Math.max(maxFreq, freq[ch[high]]);
            int diff = len - maxFreq;
            while(diff > k){
                freq[ch[low]]--;
                low++;
                len = high - low + 1;
                diff = len - maxFreq;
            }
            len = high - low + 1;
            longestSubString = Math.max(longestSubString,len);
            high++;
       }
        return longestSubString;
    }
}