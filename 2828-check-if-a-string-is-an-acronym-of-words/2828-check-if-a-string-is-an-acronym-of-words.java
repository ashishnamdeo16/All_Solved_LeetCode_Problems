class Solution {
    public boolean isAcronym(List<String> words, String s) {
        String s2 = "";
        for(int i=0;i<words.size();i++){
            String a = words.get(i);
            s2 += a.charAt(0);
        }
        return s2.equals(s);
    }
}