class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
       char[] newS = s.toCharArray();
       char[] newT = t.toCharArray();
       Arrays.sort(newS);
       Arrays.sort(newT);
       for(int i=0;i<newS.length;i++){
        if(newS[i] != newT[i]) return false;
       }
       return true;
    }
}