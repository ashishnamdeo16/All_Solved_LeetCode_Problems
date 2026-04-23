class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String finalString1 = "";
        String finalString2 = "";
        for(String s : word1){
          finalString1 += s;
        }
        for(String s : word2){
          finalString2 += s;
        }
        return finalString1.equals(finalString2);
    }
}