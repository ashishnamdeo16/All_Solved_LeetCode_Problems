class Solution {
    public boolean isBalanced(String num) {
        int evenSum = 0;
        int oddSum = 0;
        for(int i=0;i<num.length();i++){
            int val = num.charAt(i) - '0';
            if(i % 2 == 0){
                evenSum += val;
            }else{
                oddSum += val;
            }
        }
        return evenSum == oddSum;
    }
}