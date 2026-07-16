class Solution {
    public int lengthOfLongestSubstring(String s) {
      HashSet<Character> set = new HashSet<>();
      int len = 0;  
      int l = 0;
      int r = 0;

      while(r < s.length()){
        char ch = s.charAt(r);

        while(set.contains(ch)){
            set.remove(s.charAt(l));
            l++;
        }
        
        len = Math.max(len,r - l + 1);

        set.add(ch);
        r++;
      } 

      return len;
    }
}