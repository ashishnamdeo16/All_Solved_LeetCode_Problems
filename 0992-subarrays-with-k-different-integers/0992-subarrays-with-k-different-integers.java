class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
       return atmost(nums,k) - atmost(nums,k-1);
    }

    public int atmost(int[] nums,int k){
        HashMap<Integer,Integer> map = new HashMap<>();
        int l = 0;
        int r = 0;
        int count = 0;

        while(r < nums.length){
            int val  = nums[r];
            map.put(val,map.getOrDefault(val,0)+1);
            while(map.size() > k){
                 map.put(nums[l],map.get(nums[l])-1);
                 if(map.get(nums[l]) == 0){
                    map.remove(nums[l]);
                 } 
                 l++;
            }
            count += r - l + 1;
            r++;
        }

        return count;
    }
}