class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int l=0;
        int r=numbers.length-1;

        while(l<r){
            int sum = numbers[l] + numbers[r];
            if(sum > target){
                r--;
            }else if(sum < target){
                l++;
            }else{
                return new int[]{l+1,r+1};
            }

        }
       return new int[]{-1,-1};
    }
}

//It can also be solved using hashmap but will create an additional overhead for keeping and maintaining the hashmap 
//Hence we chose 2 pointer here to find since array is already sorted