class Solution {
    public int[] separateDigits(int[] nums) {
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            String s = String.valueOf(nums[i]);
            for(char ch : s.toCharArray()){
                arr.add(ch - '0');
            }
        }

        int[] finalArray = new int[arr.size()];

        for(int i =0;i<arr.size();i++){
            finalArray[i] = arr.get(i);
        }

        return finalArray;
    }
}