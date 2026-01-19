class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        return findCombination(candidates,target);
    }

    public static List<List<Integer>> findCombination(int[] nums,int target){
        int total = 0;
        int start = 0;
        List<List<Integer>> finalist = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        findAllSums(nums,start,temp,total,target,finalist);
        return finalist;
    }

    public static void findAllSums(
    int[] nums,
    int start,
    List<Integer> temp,
    int total,
    int target,
    List<List<Integer>> finalList
    ){
        if(target == total){
            finalList.add(new ArrayList<>(temp));
            return;
        }
        if(start >= nums.length || total > target ){
            return;
        }
        temp.add(nums[start]);
        findAllSums(nums,start,temp,total+nums[start],target,finalList);
        temp.remove(temp.size()-1);
        findAllSums(nums,start+1,temp,total,target,finalList);
    }
   
}