class Solution {
    public int[] minDistinctFreqPair(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int min = Integer.MAX_VALUE;
        for(int x : nums){
            map.put(x,map.getOrDefault(x,0)+1);
            min = Math.min(x,min);
        }

        int secMin = Integer.MAX_VALUE;
        
        for(int x : nums){
            if(x == min){
                continue;
            }

            if(min < x  && map.get(x) != map.get(min)){
                secMin = Math.min(secMin,x);
            }
        }
    
       return secMin == Integer.MAX_VALUE
       ? new int[]{-1, -1}
       : new int[]{min, secMin};
    }
}

// We need to find a Pair in which we need to find smallest values whose frequency is differnt 

// I will make map in which i will store the values with there frequencies 
// After that i will make Priority Queue 