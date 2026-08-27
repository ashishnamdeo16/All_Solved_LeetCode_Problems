class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> arr = new ArrayList<>();

        for(int i =0;i < nums.length;i++){
            if(i > 0 && nums[i] == nums[i-1]){
                continue;
            }

        for(int k =i+1; k < nums.length;k++){
            if(k > i+1 && nums[k] == nums[k-1]){
                continue;
            }

            int l = k + 1;
            int r = nums.length - 1;

            while(l < r){
                Long sum = (long) nums[i] + nums[l] + nums[r] + nums[k];

                if(sum == target){
                   List<Integer> arr2 = new ArrayList<>();
                    arr2.add(nums[i]);
                    arr2.add(nums[l]);
                    arr2.add(nums[r]);
                    arr2.add(nums[k]);
                    arr.add(arr2);
                    l++;
                    r--;
                    while(l < r && nums[l] == nums[l - 1]) l++;
                    while(l < r && nums[r] == nums[r + 1]) r--;
                }else if(sum > target){
                    r--;
                }else{
                    l++;
                }
            }
        }
        }

        return arr;
    }
}