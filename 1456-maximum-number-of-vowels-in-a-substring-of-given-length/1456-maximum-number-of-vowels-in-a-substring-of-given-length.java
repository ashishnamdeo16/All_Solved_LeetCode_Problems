class Solution {
    public int maxVowels(String s, int k) {
        char[] sChar = s.toCharArray();
        int l = 0;
        int r = 0;
        int vowelCount = 0;
        int max = 0;
        while(r < sChar.length){
            if(r-l+1 < k){
                if(sChar[r] == 'a' || 
                   sChar[r] == 'e' || 
                   sChar[r] == 'i' || 
                   sChar[r] == 'o' || 
                   sChar[r] == 'u'){
                   vowelCount++;
                } 
                r++;
            }else if(r-l+1 == k){
                 if(sChar[r] == 'a' || 
                   sChar[r] == 'e' || 
                   sChar[r] == 'i' || 
                   sChar[r] == 'o' || 
                   sChar[r] == 'u'){
                   vowelCount++;
                }
                max = Math.max(max,vowelCount);
                if(sChar[l] == 'a' || 
                   sChar[l] == 'e' || 
                   sChar[l] == 'i' || 
                   sChar[l] == 'o' || 
                   sChar[l] == 'u'){
                   vowelCount--;
                } 
                l++;
                r++;
            }
        }
        return max;
    }
}