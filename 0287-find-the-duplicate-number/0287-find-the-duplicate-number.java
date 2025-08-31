class Solution {
    public int findDuplicate(int[] nums) {
    HashMap<Integer,Integer> arr = new HashMap<>();
    int i=0;
    while(i<nums.length){
        arr.put(nums[i],arr.getOrDefault(nums[i],0)+1);
        i++;
    }

    for(Map.Entry<Integer, Integer> entry : arr.entrySet()){
        if(entry.getValue() != 1){
            return entry.getKey();
        }
    }
    return -1;
    }
}