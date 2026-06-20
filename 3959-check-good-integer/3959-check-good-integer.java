class Solution {
    public boolean checkGoodInteger(int n) {
        int digitSum = sum(n,true);
        int squareSum = sum(n,false);
        if(squareSum - digitSum >= 50){
            return true;
        }
        return false;
    }

    public int sum(int n,boolean isDigitSum){
        int sum = 0;
        if(isDigitSum){
         while(n > 0){
            int rem = n % 10;
            sum += rem;
            n /= 10;
            }
        }else{
            while(n > 0){
            int rem = n % 10;
            sum += rem * rem;
            n /= 10;
            }
        }
       
        return sum;
    } 
}

// n = positive integer
// digitSum = sum of all digits in n 
// squareSum = sum of digits square
// good only if squareSum - digitSum >= 50
// Bas false