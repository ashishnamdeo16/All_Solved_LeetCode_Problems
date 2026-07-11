class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        int[] arr = new int[2];
        Set<Integer> set = new HashSet<>();
        int i = 0;

        for(int x : nums){
            if(set.contains(x)){
                arr[i++] = x;
            }
            set.add(x);
        }

        return arr;
    }
}