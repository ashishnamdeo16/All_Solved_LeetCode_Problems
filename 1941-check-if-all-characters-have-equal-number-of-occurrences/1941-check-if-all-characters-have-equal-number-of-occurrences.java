class Solution {
    public boolean areOccurrencesEqual(String s) {
        int[] freq = new int[26];

        for(char c : s.toCharArray()){
            freq[c - 'a']++;
        }

        int count = 0;
        for(int i=0;i<freq.length;i++){
           if(freq[i] != 0){
            count = freq[i];
            break;
           }
        }

         for(int i=0;i<freq.length;i++){
           if(freq[i] != 0 && freq[i] != count){
                return false;
           }
        }



        return true;
    }
}