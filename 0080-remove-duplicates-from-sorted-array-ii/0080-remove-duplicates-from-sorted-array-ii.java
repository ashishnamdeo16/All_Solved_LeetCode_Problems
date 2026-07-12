class Solution {
    public int removeDuplicates(int[] nums) {
        // HashMap<Integer,Integer> map = new HashMap<>();
        // int l = 1;
        // map.put(nums[0],1);

        // for(int i=1;i<nums.length;i++){
        //     if(!map.containsKey(nums[i])){
        //         nums[l++] = nums[i];
        //         map.put(nums[i],1);
        //     }else if(map.containsKey(nums[i])){
        //         if(map.get(nums[i]) < 2){
        //             nums[l++] = nums[i];
        //             map.put(nums[i], map.get(nums[i]) + 1);
        //         }
        //     }
        // }

        // return l;

        int l = 1;
        int count = 1;
        for(int i=1;i<nums.length;i++){
            if(nums[i] != nums[i-1]){
                nums[l++] = nums[i];
                count = 1;
            }else if(nums[i] == nums[i-1] && count < 2){
                nums[l++] = nums[i];
                count++;
            }
        }

        return l;
    }
}

// Map -> Num and Count
// if count is less then 2 
// we will keep on increasing the l and placing the values
// if count is greater we will do nothing 