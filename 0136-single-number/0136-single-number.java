class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer,Integer> freq = new HashMap<>();
        for(int i=0;i<nums.length;i++){
                int num = nums[i]; 
                freq.put(num,freq.getOrDefault(num, 0) + 1);
        }
        for(int i: freq.keySet()){
            if(freq.get(i) == 1){
                return i;
            }
        }
        return -1;
    }
}