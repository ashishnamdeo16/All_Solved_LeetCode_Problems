class Solution {
    public boolean repeatedSubstringPattern(String s) {
        StringBuilder sb = new StringBuilder(s);
        int l = 0;
        int r = 0;

        while(r < s.length()-1 && l<=r){
            if(funcToFind(sb.substring(l,r+1),s)) return true;
            if(r < s.length()){
                r++;
            }else{
                l++;
            }
        }

        return false;
    }

    public boolean funcToFind(String s,String og){
         StringBuilder sb = new StringBuilder();
         int r = 0;
         while(r < og.length()){
            sb.append(s);
            r += s.length();
         }
         String fi = sb.toString();
         return fi.equals(og);
    }
}

//Given String
//Can a string be constructed from a substring 

//Helper function to find If a possible or not 
//Form Substrings

