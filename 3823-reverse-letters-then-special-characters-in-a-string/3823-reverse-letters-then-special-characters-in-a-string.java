class Solution {
    public String reverseByType(String s) {
        char[] ch = s.toCharArray();
        int l = 0;
        int r = ch.length-1;
        while(l<r){
            if(Character.isLetter(ch[l]) && Character.isLetter(ch[r])){
             char temp = ch[l];
             ch[l] = ch[r];
             ch[r] = temp;
             l++;
             r--;
            }else if(!Character.isLetter(ch[l]) && Character.isLetter(ch[r])){
                l++;
            }else{
                r--;
            }
        }
         l = 0;
        r = ch.length-1;
            while(l<r){
            if(!Character.isLetterOrDigit(ch[l]) && !Character.isLetterOrDigit(ch[r])){
             char temp = ch[l];
             ch[l] = ch[r];
             ch[r] = temp;
             l++;
             r--;
            }else if(Character.isLetterOrDigit(ch[l])  && !Character.isLetterOrDigit(ch[r])){
                l++;
            }else{
                r--;
            }
        }

        return String.valueOf(ch);
    }
}