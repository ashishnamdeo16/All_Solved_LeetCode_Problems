class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> finalAns = new ArrayList<>();
        Arrays.sort(nums);

        for(int i=0;i<nums.length;i++){
            if(i > 0 && nums[i] == nums[i-1]) continue;

            int l = i+1;
            int r = nums.length-1;

            while(l < r){
                int sum = nums[i] + nums[r] + nums[l];
                if(sum == 0){
                    List<Integer> arr = new ArrayList<>();
                    arr.add(nums[i]);
                    arr.add(nums[l]);
                    arr.add(nums[r]);
                    finalAns.add(arr);
                    l++;
                    r--;
                    while(l < r && nums[l] == nums[l-1]) l++;
                    while(r >= l && nums[r] == nums[r+1]) r--;
                }else if(sum > 0){
                    r--;
                }else{
                    l++;
                }
            }
        }

        return finalAns;
    }
}