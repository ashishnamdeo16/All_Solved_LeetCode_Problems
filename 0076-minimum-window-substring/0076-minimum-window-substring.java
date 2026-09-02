class Solution {
    public String minWindow(String s, String t) { 
        int[] freqT = new int[128];
        int[] freqS = new int[128];
        int minlen = Integer.MAX_VALUE;
        int start = 0;

        for(char ch : t.toCharArray()){
            freqT[ch]++;
        }
        
        int l = 0;
        int r = 0;

        while(r < s.length()){
            char ch = s.charAt(r);
            freqS[ch]++;

            while(isValid(freqS,freqT)){
                freqS[s.charAt(l)]--;
                
                int len = r - l + 1;

                if(minlen > len){
                    minlen = len;
                    start = l;
                }
                l++;
            }

            r++;
        }


        return minlen == Integer.MAX_VALUE ? "" : s.substring(start,start+minlen);
        
    }

    public boolean isValid( int[] freqS , int[] freqT ){
        for(int i =0;i<freqS.length;i++){
            if(freqT[i] > freqS[i]){
                return false;
            }
        }

        return true;
    }
}