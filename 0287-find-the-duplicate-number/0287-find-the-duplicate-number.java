class Solution {
    public int findDuplicate(int[] nums) {  

        Arrays.sort(nums);
        int l = 0;
        int r = l+1;
        while(r<nums.length){
            if(nums[l] == nums[r]){
                return nums[l];
            }
            l++;
            r++;
        }

        return -1;


        // int res = 0;
        // for(int i :nums){
        //     res^=i;
        // }
        //  return res;

    // HashMap<Integer,Integer> arr = new HashMap<>();
    // int i=0;
    // while(i<nums.length){
    //     arr.put(nums[i],arr.getOrDefault(nums[i],0)+1);
    //     i++;
    // }

    // for(Map.Entry<Integer, Integer> entry : arr.entrySet()){
    //     if(entry.getValue() != 1){
    //         return entry.getKey();
    //     }
    // }

    }
}