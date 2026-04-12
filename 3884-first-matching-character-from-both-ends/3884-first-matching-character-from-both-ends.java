class Solution {
    public int firstMatchingIndex(String s) {
        int res = Integer.MAX_VALUE;
        for(int i =0 ;i<s.length();i++){
            if(s.charAt(i) == s.charAt(s.length() - i - 1)){
                res = Math.min(res,i);
            }
        }
        return res == Integer.MAX_VALUE ? -1 : res;
    }
}