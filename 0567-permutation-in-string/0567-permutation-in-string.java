class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length() > s2.length()) return false;

        int l = 0;
        int r = 0;

        int[] freqP = new int[128];
        int[] freqS = new int[128];

        for(char ch :s1.toCharArray()){
            freqP[ch]++;
        }

        int k = s1.length();

        while(r < s2.length()){
            freqS[s2.charAt(r)]++;

            if(r - l + 1 < k){
                r++;
            }else{
                if(isValid(freqP,freqS)){
                   return true;
                }
                freqS[s2.charAt(l)]--;
                l++;
                r++;
            }
        }

        return false;
    }

    public boolean isValid(int[] freqP,int[] freqS){
        for(int i =0;i<freqS.length;i++){
            if(freqS[i] != freqP[i]){
                return false;
            }
        }
        return true;
    }


 }
