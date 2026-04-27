class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        ArrayList<List<Integer>> finalAns = new ArrayList<>();
        Arrays.sort(nums);

       for(int i =0;i<nums.length;i++){
            if(i > 0 && nums[i] == nums[ i - 1 ]) continue;

            for(int j=i+1;j<nums.length;j++){
                if(j > i + 1 && nums[j] == nums[ j - 1 ]) continue;

                int l = j+1;
                int r = nums.length -1;

                while(l<r){
                    long sum = (long) nums[i] + nums[j] + nums[l] + nums[r];

                    if(sum == target){
                        List<Integer> arr = new ArrayList<>();
                        arr.add(nums[i]);
                        arr.add(nums[j]);
                        arr.add(nums[l]);
                        arr.add(nums[r]);
                        l++;
                        r--;
                        finalAns.add(arr);

                        while(l < r && nums[l] == nums[l-1]) l++;
                        while(r >= l && nums[r] == nums[r+1]) r--;

                    }else if(sum > target){
                        r--;
                    }else{
                        l++;
                    }
                }
            }
       }

        return finalAns;
    }
}