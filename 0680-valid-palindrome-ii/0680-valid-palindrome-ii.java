class Solution {
    public boolean validPalindrome(String s) {
        StringBuilder sb = new StringBuilder(s);
        int l = 0;int r = sb.length()-1;
        if(isPalindrome(sb,l,r)) return true;

        while(l<r){
            if(sb.charAt(l) != sb.charAt(r)){
                return isPalindrome(sb,l+1,r) || isPalindrome(sb,l,r-1);
            }
            l++;
            r--;
        }
        
        return false;
    }

    public boolean isPalindrome(StringBuilder s,int l,int r){
        while(l < r){
            if(s.charAt(l++) != s.charAt(r--)){
                return false;
            }
        }

        return true;
    }
}