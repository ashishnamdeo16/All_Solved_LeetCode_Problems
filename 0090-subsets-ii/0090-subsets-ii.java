class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> finalList = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        backTrack(nums,0,temp,finalList);
        return finalList;
    }

    public static void backTrack(int[] nums,int start,List<Integer> temp, List<List<Integer>> finalList){
        finalList.add(new ArrayList<>(temp));

        for(int i=start;i<nums.length;i++){
            if(i > start &&  nums[i] == nums[i-1]) continue;
            temp.add(nums[i]);
            backTrack(nums,i+1,temp,finalList);
            temp.remove(temp.size()-1);
        }
    }
}