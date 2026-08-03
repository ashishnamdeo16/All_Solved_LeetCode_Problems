class Solution {
    public int sumDivisibleByK(int[] nums, int k) {
        int[] freq = new int[101];

        for(int x : nums){
            freq[x]++;
        }

        int sum = 0;

        for(int x = 0;x<freq.length;x++){
            if(freq[x] != 0 && freq[x]%k == 0){

                for(int i = 0;i<freq[x];i++){
                    sum += x;
                }

            }
        }

        return sum;
    }
}