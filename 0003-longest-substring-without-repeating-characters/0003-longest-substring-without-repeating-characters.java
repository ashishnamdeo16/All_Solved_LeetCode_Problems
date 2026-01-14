class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        int maxLength = 0;
        int l = 0;
        int r = 0;
        while(r < s.length()){
            char ch = s.charAt(r);
            if(!set.contains(ch)){
                set.add(ch);
                maxLength = Math.max(maxLength, set.size());
                r++;
            }else{
                set.remove(s.charAt(l));
                l++;
            }
        }

        return maxLength;
    }
}