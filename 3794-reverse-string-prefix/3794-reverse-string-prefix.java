class Solution {
    public String reversePrefix(String s, int k) {
        if(k == 1) return s;
        String newS = rev(s.substring(0,k));
        while(k<s.length()){
            newS += s.charAt(k);
            k++;
        }
        return newS;
    }

    public String rev(String s){
        StringBuilder sb = new StringBuilder(s);
        int l = 0; 
        int r = sb.length()-1;
        while(l < r) {
            char temp = sb.charAt(l);
            sb.setCharAt(l,sb.charAt(r));
            sb.setCharAt(r,temp);
            l++;
            r--;
        }
        return sb.toString();
    }
}