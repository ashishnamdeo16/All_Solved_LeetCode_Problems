class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int sumofN = (n*(n+1))/2;
        int sumofArrayElements = 0;
        for(int num :nums){
            sumofArrayElements += num;
        }
        int missingNum = sumofN - sumofArrayElements;
        return missingNum;
    }
}