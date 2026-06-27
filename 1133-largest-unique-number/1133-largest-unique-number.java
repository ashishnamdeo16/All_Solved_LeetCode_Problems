class Solution {
    public int largestUniqueNumber(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int x : nums){
            map.put(x,map.getOrDefault(x,0)+1);
        }

        int max = Integer.MIN_VALUE;

        for( Map.Entry<Integer,Integer> entry : map.entrySet()){
            if(entry.getValue() == 1){
                 max = Math.max(entry.getKey(),max);
            }
        }   

        return max == Integer.MIN_VALUE ? -1 : max;
        
    }
}

