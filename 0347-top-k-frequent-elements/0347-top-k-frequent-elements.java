class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        if(nums.length < 1){
            return nums;
        }
        HashMap<Integer,Integer> arr = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            arr.put(nums[i],arr.getOrDefault(nums[i],0) + 1);
        }
        ArrayList<Map.Entry<Integer,Integer>> list = new ArrayList<>(arr.entrySet());
        list.sort((a, b) -> b.getValue() - a.getValue());
        int[] newArr = new int[k];
        for(int j=0;j<newArr.length;j++){
            newArr[j] = list.get(j).getKey();
        }
        return newArr;
    }
}