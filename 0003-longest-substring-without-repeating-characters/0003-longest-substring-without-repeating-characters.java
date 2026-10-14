class Solution {
    public int lengthOfLongestSubstring(String s) {
        int l = 0;
        int r = 0;

        int maxLen = 0;

        Set<Character> set = new HashSet<>();

        while(r < s.length()){
            char ch = s.charAt(r);

            while(set.contains(ch)){
                set.remove(s.charAt(l));
                l++;
            }

            maxLen = Math.max(maxLen,r - l + 1);
            set.add(ch);
            r++;
        }

        return maxLen;
    }
}