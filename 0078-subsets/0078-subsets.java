class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        return computeSubSets(nums);
    }


    public static List<List<Integer>> computeSubSets(int[] nums){
        List<List<Integer>> finalList = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        finalSubset(nums,0,temp,finalList);
        return finalList;
    }

    public static void finalSubset(int[] nums, int start,  List<Integer> temp,List<List<Integer>>  finalList){
        finalList.add(new ArrayList<>(temp));
        for(int i=start;i<nums.length;i++){
            temp.add(nums[i]);
            finalSubset(nums,i+1,temp,finalList);
            temp.remove(temp.size() - 1);
        }
    }
}