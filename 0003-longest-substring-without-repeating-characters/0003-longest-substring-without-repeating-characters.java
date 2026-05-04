class Solution {
    public int lengthOfLongestSubstring(String s) {
       int right = 0;
       int left = 0;
       int maxLen = Integer.MIN_VALUE;
       StringBuilder sb = new StringBuilder();

       while(right < s.length()){
            char ch = s.charAt(right);
            sb.append(ch);
            while(containsDup(sb)){
                sb.deleteCharAt(0);
                left++;
            }
            maxLen = Math.max(maxLen,right -left + 1);
            right++;
       }
       return maxLen == Integer.MIN_VALUE ? 0 : maxLen;
    }

    public boolean containsDup(StringBuilder sb){
        Set<Character> set = new HashSet<>();
        for(int i=0;i<sb.length();i++){
            if(set.contains(sb.charAt(i))){
                return true;
            }
            set.add(sb.charAt(i));
        }
        return false;
    }
}