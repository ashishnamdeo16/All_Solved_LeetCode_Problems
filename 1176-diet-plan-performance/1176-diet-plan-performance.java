class Solution {
    public int dietPlanPerformance(int[] calories, int k, int lower, int upper) {
        int left = 0;
        int right = 0;
        int total = 0;
        while(right < calories.length){
            if(right - left + 1 < k){
                right++;
            }else if(right - left + 1 == k){
                int sum = 0;
                int l = left;
                while(l <= right){
                    sum += calories[l];
                    l++;
                }
                if(sum < lower){
                    total--;
                }else if(sum > upper){
                    total++;
                }
                left++;
                right++;
            }
        }

        return total;
    }
}