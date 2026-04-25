class Solution {
    public boolean validDigit(int n, int x) {
        int r = n;

        int[] freq = new int[1];

        while(r > 0){
            int rem = r%10;
            if(rem == x){
                freq[0]++;
            }
            r /= 10;
        }
    
        String s = Integer.toString(n);

        if(Character.getNumericValue(s.charAt(0)) != x && freq[0] >= 1){
            return true;
        }
         

        return false;   
          
    } 
}