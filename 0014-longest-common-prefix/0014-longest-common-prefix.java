class Solution {
    public String longestCommonPrefix(String[] strs) {
        //Redo 
        if(strs == null || strs.length == 0) return "";
        Arrays.sort(strs);
        String s1 = strs[0];
        String sEnd = strs[strs.length-1];
        int i = 0;
        while(i<s1.length() && i< sEnd.length() && s1.charAt(i) == sEnd.charAt(i)){
            i++;
        }
        return s1.substring(0,i);
    }   
}