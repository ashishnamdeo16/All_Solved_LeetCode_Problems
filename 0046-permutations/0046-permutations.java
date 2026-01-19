class Solution {
    public List<List<Integer>> permute(int[] nums) {
        return findAllPermutationof(nums);
    }

    public static List<List<Integer>> findAllPermutationof(int[] arr){
        ArrayList<List<Integer>> finalList = new ArrayList<>();
        recurList(0,arr,finalList);
        return finalList;
    }

    public static void recurList(int start,int[] nums,List<List<Integer>> finalList){
        if(start == nums.length-1){
            List<Integer> list = new ArrayList<>();
            for (int x : nums) list.add(x);
            finalList.add(list);
            return;
        }
        for(int i=start;i<nums.length;i++){
            swap(nums,start,i);
            recurList(start+1,nums,finalList);
            swap(nums,start,i);
        }

    }

    public static void swap(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}