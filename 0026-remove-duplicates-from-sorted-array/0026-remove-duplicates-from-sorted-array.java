class Solution {
    public int removeDuplicates(int[] nums) {
        // int l = 1;
        // if(nums.length == 0) return 0;
        // for(int i=1;i<nums.length;i++){
        //     if(nums[i] != nums[i - 1]){
        //         nums[l++] = nums[i];
        //     } 
        // }
        // return l;

        Set<Integer> set = new HashSet<>();
        int l = 1;
        set.add(nums[0]);
        for(int i=1;i<nums.length;i++){
            if(!set.contains(nums[i])){
                nums[l++] = nums[i];
                set.add(nums[i]);
            }
        }
        return l;
    }
}

// I will create a SET
// Put first element in it and start from index 1
// l = 0 and r = numlength 
// same to continue 
// diff to swap
// 