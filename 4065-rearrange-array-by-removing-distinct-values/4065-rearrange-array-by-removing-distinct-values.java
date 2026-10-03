class Solution {
    public int[] rearrangeArray(int[] nums) {
        TreeMap<Integer,Integer> map = new TreeMap<>();
        int[] ans = new int[nums.length];
         int l = 0;

        for(int x : nums){
            map.put(x,map.getOrDefault(x,0)+1);
        }

         while (!map.isEmpty()) {

            Iterator<Map.Entry<Integer, Integer>> it =
                    map.entrySet().iterator();

            while (it.hasNext()) {
                Map.Entry<Integer, Integer> entry = it.next();

                ans[l++] = entry.getKey();

                int remaining = entry.getValue() - 1;

                if (remaining == 0) {
                    it.remove();       // Safe removal
                } else {
                    entry.setValue(remaining);
                }
            }
        }

        return ans;
       
    }
}