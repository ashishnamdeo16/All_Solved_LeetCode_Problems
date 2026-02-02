class Solution {
    public String removeTrailingZeros(String num) {
        int i = num.length()-1 ;
        while(i>=0){
            char c = num.charAt(i);
            if(c != '0'){
                return num.substring(0,i+1);
            }
            i--;
        }
        return num;
    }
}