class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> arr = new ArrayList<>();

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for(int x : nums){
            min = Math.min(min,x);
            max = Math.max(max,x);
        }
       
        for(int i=min;i<=max;i++){
            boolean present = false;
            for(int x : nums){
                if(i == x){
                    present = true;
                }
            }
            if(!present) arr.add(i);
        }

        return arr;
    }
}