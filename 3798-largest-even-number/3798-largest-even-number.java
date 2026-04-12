class Solution {
    public String largestEven(String s) {
        char last = s.charAt(s.length() - 1);
        int val = last - '0';
        if(isEven(val)) return s;

        StringBuilder sb = new StringBuilder(s);
        int l = s.length() -1;

        while( l >= 0 ){
            int val1 = sb.charAt(l) - '0';
            if(!isEven(val1)){
                 sb.deleteCharAt(sb.length() - 1);
            }else {
                break;
            }
                  l--;
        }

       return sb.toString();     
    }

    public boolean isEven(int n){
        if(n % 2 == 0) return true;
        return false;
    }
}