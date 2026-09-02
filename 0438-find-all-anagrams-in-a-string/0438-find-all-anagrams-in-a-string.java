class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> arr = new ArrayList<>();

        int l = 0;
        int r = 0;

        int[] freqP = new int[128];
        int[] freqS = new int[128];

        for(char ch :p.toCharArray()){
            freqP[ch]++;
        }

        int k = p.length();

        while(r < s.length()){
            freqS[s.charAt(r)]++;

            if(r - l + 1 < k){
                r++;
            }else{
                if(isValid(freqP,freqS)){
                    arr.add(l);
                }
                freqS[s.charAt(l)]--;
                l++;
                r++;
            }
        }


        return arr;
    }

    public boolean isValid(int[] freqP,int[] freqS){
        for(int i =0 ;i<freqS.length;i++){
            if(freqS[i] != freqP[i]){
                return false;
            }
        }
        return true;
    }


}
