class Solution {
    public int characterReplacement(String s, int k) {
      int[] freq = new int[128];
      int longest = -1;
      int maxFreq = 0;
      int l = 0;
      int r = 0;

      while(r < s.length()){
        char ch = s.charAt(r);
        freq[ch]++;
        maxFreq = Math.max(freq[ch],maxFreq);
        int len = r - l + 1;
        int diff = len - maxFreq;

        while(diff > k){
            freq[s.charAt(l)]--;
            l++;
            len = r - l + 1;
            diff = len - maxFreq;
        }

        longest = Math.max(r-l+1,longest);
        r++;
      }  
      return longest;
    }
}