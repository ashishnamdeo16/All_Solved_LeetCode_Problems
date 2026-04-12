class Solution {
    public String trimTrailingVowels(String s) {
        StringBuilder sb = new StringBuilder(s);
        int r = s.length() - 1;
        while(r >= 0){
            char ch = sb.charAt(r);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                sb.deleteCharAt(sb.length() - 1);
                r--;
            }else{
                break;
            } 
        }    
        return sb.toString();
    }
}