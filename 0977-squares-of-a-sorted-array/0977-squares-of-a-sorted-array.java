class Solution {
    public int[] sortedSquares(int[] nums) {
        int l = 0;

        List<Integer> neg = new ArrayList<>();
        List<Integer> pos = new ArrayList<>();

        while(l<nums.length){
            if(nums[l] < 0){
                neg.add(nums[l] * nums[l]);
            }else{
                pos.add(nums[l] * nums[l]);
            }
            l++;
        }

        int i = neg.size()-1;
        int j = 0;
        int o = 0;

        while(i >= 0 && j < pos.size()){
            if(neg.get(i) <= pos.get(j)){
                nums[o++] = neg.get(i);
                i--;
            }else if(neg.get(i) > pos.get(j)){
                nums[o++] = pos.get(j);
                j++;
            }
        }

        while(i >=0 ){
             nums[o++] = neg.get(i);
             i--;
        }

        while( j < pos.size()){
              nums[o++] = pos.get(j);
              j++;
        }

        //Brute Force
        // for(int i=0;i<nums.length;i++){
        //     nums[i] = nums[i] * nums[i];
        // }
        // Arrays.sort(nums);
        return nums;
 }
}