class Solution {
    public boolean digitCount(String num) {
        int n = num.length();
        int[] freq = new int[10];

        for(int x : num.toCharArray()){
           int ch = Character.getNumericValue(x);
           freq[ch]++;
        }

        for(int i=0;i<num.length();i++){
            int nooFtimes = Character.getNumericValue(num.charAt(i));
            if(freq[i] != nooFtimes){
                return false;
            }
        }
        
        return true;
    }
}