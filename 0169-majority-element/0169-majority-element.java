class Solution {
    public int majorityElement(int[] nums) {
        int count =0;
        int res=0;
       
       for(int i=0;i<nums.length;i++){
            if (res == nums[i]) {
                count++;
            }else if(count == 0) {
                res = nums[i];
                count = 1;
            }else {
                count--;
            }
       }

       return res;

        //Brute Force Solution
        // HashMap<Integer,Integer> map = new HashMap<>();
        // for(int i=0;i<nums.length;i++){
        //     map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        // }

        // int maxfreq =0;
        // int majorityElement = nums[0]; 
        // for(Map.Entry<Integer,Integer> entry: map.entrySet()){
        //     if(entry.getValue() >  maxfreq){
        //         maxfreq = entry.getValue();
        //         majorityElement = entry.getKey();
        //     }
        // }
        // return majorityElement;
    }
}