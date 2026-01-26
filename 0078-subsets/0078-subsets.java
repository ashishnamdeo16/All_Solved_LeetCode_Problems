class Solution {
    public List<List<Integer>> subsets(int[] nums) {
    List<List<Integer>> finalList = new ArrayList<>();
    List<Integer> temp = new ArrayList<>();
    findAllSubsets(nums,0,temp,finalList);
    return finalList;
    }

    public static void findAllSubsets(int[] nums,int index, List<Integer>temp, List<List<Integer>> finalList){
        if(index == nums.length){
            finalList.add(new ArrayList<>(temp));
            return;
        }
            findAllSubsets(nums,index+1,temp,finalList);
            temp.add(nums[index]);
            findAllSubsets(nums,index+1,temp,finalList);
            temp.remove(temp.size()-1);
    }
}