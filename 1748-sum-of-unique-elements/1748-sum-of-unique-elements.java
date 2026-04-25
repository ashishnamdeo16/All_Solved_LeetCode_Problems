class Solution {
    public int sumOfUnique(int[] nums) {
        int[] freq = new int[101];

        for(int x : nums){
            freq[x - 1]++;
        }

        int sum = 0;

        for(int i=0;i<freq.length;i++){

            if(freq[i] == 1){
               sum += i + 1;
            }
        }

        return sum;
    }
}