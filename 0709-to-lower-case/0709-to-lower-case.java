class Solution {
    public String toLowerCase(String s) {
        StringBuilder sb = new StringBuilder(s);
        for(int i=0; i<sb.length();i++){
            char ch = sb.charAt(i);
            if(ch >= 'A' && ch <= 'Z'){
               sb.setCharAt(i,Character.toLowerCase(ch));
            }
        }

        return sb.toString();
    }
}