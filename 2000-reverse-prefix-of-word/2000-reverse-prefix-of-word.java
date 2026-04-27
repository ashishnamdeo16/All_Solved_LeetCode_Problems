class Solution {
    public String reversePrefix(String word, char ch) {
        int endIndex = 0;
        for(int i=0;i<word.length();i++){
            if(word.charAt(i) == ch){
                endIndex = i;
                break;
            }
        }

        StringBuilder sb = new StringBuilder(word);
        int l=0;
        while(l < endIndex){
            char c = sb.charAt(l);
            char a = sb.charAt(endIndex);
            sb.setCharAt(l,a);
            sb.setCharAt(endIndex,c);
            l++;
            endIndex--;
        }

        return sb.toString();
    }
}