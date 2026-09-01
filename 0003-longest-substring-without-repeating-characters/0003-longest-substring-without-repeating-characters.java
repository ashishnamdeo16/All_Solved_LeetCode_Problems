class Solution {
    public int lengthOfLongestSubstring(String s) {
      int l = 0;
      int r = 0;
      int len = Integer.MIN_VALUE;

      HashSet<Character> set = new HashSet<>();

      while(r < s.length()){
            char ch = s.charAt(r);

            while(set.contains(ch)){
                set.remove(s.charAt(l));
                l++;
            }

            len = Math.max(r-l+1,len);
            set.add(ch);
            r++;
      }

      return len == Integer.MIN_VALUE ? 0 : len;
    }
}