class Solution {
    public boolean isAdjacentDiffAtMostTwo(String s) {
        int l = 0;
        int r = 1;
        boolean isValid = true;
        while(r < s.length()){
            int n = Math.abs(Character.getNumericValue(s.charAt(l)) - Character.getNumericValue(s.charAt(r)));
            if(n > 2){
                isValid = false;
            }
            l++;
            r++;
        }
        if(isValid){
            return true;
        } 
        return false;
    }
}

//You need to find numeric values for the chars
//two pointer // l and r 
// Math.abs(Character.getNumericValue() - Character.getNumericValue())
// 