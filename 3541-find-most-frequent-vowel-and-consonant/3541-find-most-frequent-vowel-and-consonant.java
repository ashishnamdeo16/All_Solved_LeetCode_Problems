class Solution {
    public int maxFreqSum(String s) {
        int[] freq = new int[26];
        int maxVowel = 0;
        int maxConstant = 0;
        for(char ch : s.toCharArray()){
            freq[ch - 'a']++;
        }

        for(int i=0;i<26;i++){
            char c = (char) (i + 'a');
            if(c == 'a' || c == 'e'|| c == 'i'||c == 'o'||c == 'u' ){
                if(maxVowel < freq[i]){
                    maxVowel = freq[i];
                }
            }else{
                if(maxConstant < freq[i]){
                    maxConstant = freq[i];
                }
            }
        }
        return maxVowel + maxConstant;
    }
}