class Solution {
    public String reverseOnlyLetters(String s) {
        int l = 0;
        int r = s.length() - 1;
        StringBuilder sb = new StringBuilder(s);
        while(l < r){
            char ch = s.charAt(l);
            char ch2 = s.charAt(r);
            if(Character.isLetter(ch) && Character.isLetter(ch2)){
                 sb.setCharAt(l,ch2);
                 sb.setCharAt(r,ch);   
                 l++;
                 r--;
            }else if(Character.isLetter(ch)){
                r--;
            }else if(Character.isLetter(ch2)){
                l++;
            }else{
                l++;
                r--;
            }
        }
        return sb.toString();
    }
}