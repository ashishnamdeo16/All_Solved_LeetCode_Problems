class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        int maxLength = 0;
        int l = 0;
        int r = 0;
        StringBuilder sb = new StringBuilder();

        while(r < s.length()){
            char ch = s.charAt(r);
            if(!set.contains(ch)){
                sb.append(ch);
                set.add(ch);
                maxLength = Math.max(maxLength, sb.length());
                r++;
            }else{
                sb.deleteCharAt(0);
                set.remove(s.charAt(l));
                l++;
            }
        }

        return maxLength;
    }
}