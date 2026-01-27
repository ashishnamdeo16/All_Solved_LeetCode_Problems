class Solution {
    public boolean isPowerOfTwo(int n) {
       return checkForMe(n);
    }

    public boolean checkForMe(int n){
        if(n == 1){
            return true;
        }else if(n%2 != 0 || n == 0){
            return false;
        }
        return checkForMe(n/2);
    }
}

// checkForMe(6)
// checkForMe(3)
// checkForMe(1.5)