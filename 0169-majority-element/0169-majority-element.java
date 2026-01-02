class Solution {
    public int majorityElement(int[] nums) {
       
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }

        int maxfreq =0;
        int majorityElement = nums[0]; 
        for(Map.Entry<Integer,Integer> entry: map.entrySet()){
            if(entry.getValue() >  maxfreq){
                maxfreq = entry.getValue();
                majorityElement = entry.getKey();
            }
        }
        return majorityElement;
    }
}