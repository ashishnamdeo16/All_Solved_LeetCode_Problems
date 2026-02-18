class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> finalList = new ArrayList<>();

        Arrays.sort(nums);

        for(int i =0;i<nums.length-2;i++){
            if(i>0 && nums[i] == nums[i-1]){
                continue;
            }
            int l = i+1;
            int r = nums.length-1;
            int s = -1 * nums[i];
            while(l<r){
                int sum = nums[l] + nums[r];
                if(sum == s){
                    List<Integer> list = new ArrayList<>();
                    list.add(nums[i]);
                    list.add(nums[l]);
                    list.add(nums[r]);
                    finalList.add(list);
                    l++;
                    r--;
                    while(l<nums.length && nums[l] == nums[l-1]){
                        l++;
                    }
                    while(r>=0 && nums[r] == nums[r+1]){
                        r--;
                    }
                }else if(s > sum){
                    l++;
                }else{
                    r--;
                }
            }
        }

        return finalList;
    }

}