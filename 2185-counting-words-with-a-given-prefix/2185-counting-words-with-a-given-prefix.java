class Solution {
    public int prefixCount(String[] words, String pref) {
        int count = 0;
        for(int i=0;i<words.length;i++){
            if(words[i].contains(pref) && checkIfPrefix(words[i],pref)){
                count++;
            }
        }
        return count;
    }

    public boolean checkIfPrefix(String word,String pref){
        for(int i=0;i<pref.length();i++){
            if(word.charAt(i) != pref.charAt(i)){
                return false;
            }
        }

        return true;
    }
}