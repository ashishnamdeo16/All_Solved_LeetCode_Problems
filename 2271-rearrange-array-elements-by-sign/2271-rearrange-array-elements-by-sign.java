class Solution {
    public int[] rearrangeArray(int[] nums) {
        int[] arr = new int[nums.length];
        List<Integer> positive = new ArrayList<>();
        List<Integer> negative = new ArrayList<>();
        int i=0;
        while(i<nums.length){
            if(nums[i] > 0){
                positive.add(nums[i]);
            }else if(nums[i] < 0){
                negative.add(nums[i]);
            }
            i++;
        }
        int l=0;
        int j=0;
        for(int k=0;k<nums.length;k++){
            if(k == 0){
                arr[k] = positive.get(l);
                l++;
            }else if(k % 2 == 0){
                arr[k] = positive.get(l);
                l++;
            }else if(k % 2 != 0) {
                arr[k] = negative.get(j);
                j++;
            }
        }
    
        return arr;
    }
}