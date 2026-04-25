class Solution {
    public int firstUniqueEven(int[] nums) {
        int[] freq = new int[101];
        // Arrays.fill(freq,0);
        for(int x : nums){
            freq[x - 1]++;
        }

        for(int i : nums){
            if(isEven(i) && freq[i - 1] == 1){
                return i;
            }
        }

        return -1;
    }

    public boolean isEven(int n){
        if(n % 2 == 0){
            return true;
        }
        return false;
    }
}