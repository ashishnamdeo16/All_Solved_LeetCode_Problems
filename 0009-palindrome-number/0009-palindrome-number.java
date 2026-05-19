class Solution {
    public boolean isPalindrome(int x) {
        int intialx = x;
        int temp = 0;
        int i=0;
        while(x>0){
            int rem = x%10;
            temp = temp*10 + rem;
            i++;
            x = x/10;
        }
        if(temp == intialx){
            return true;
        }else{
            return false;
        }
    }
}