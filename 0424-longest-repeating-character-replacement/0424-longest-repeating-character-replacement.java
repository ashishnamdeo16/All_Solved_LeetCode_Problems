class Solution {
    public int characterReplacement(String s, int k) {
        char[] ch = s.toCharArray();
        int[] freq = new int[256];
        int max = Integer.MIN_VALUE;
        int longest = Integer.MIN_VALUE;
        int r = 0;
        int l = 0;
        while(r < ch.length){
            freq[ch[r]]++;
            max = Math.max(max,freq[ch[r]]);
            int len = r - l + 1;
            int diff = len - max;

            while(diff > k){
                freq[ch[l]]--;
                l++;
                len = r - l + 1;
                diff = len - max;
            }
            
            len = r - l + 1;
            longest = Math.max(len,longest);
            r++;
        }
        return longest;
    }
}