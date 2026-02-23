class Solution {
    public int totalFruit(int[] fruits) {
        int low = 0;
        int high = 0;
        int maxFruits = Integer.MIN_VALUE;
        HashMap<Integer,Integer> map = new HashMap<>();

        while(high < fruits.length){
            map.put(fruits[high],map.getOrDefault(fruits[high],0)+1);
            
            while(map.size() > 2){
                map.put(fruits[low],map.get(fruits[low])-1);
                if(map.get(fruits[low]) == 0){
                    map.remove(fruits[low]);
                }
                low++;
            }

            int len = high - low +1;
            maxFruits = Math.max(len,maxFruits);
            high++;
        }
        return maxFruits == Integer.MIN_VALUE ? 1 : maxFruits;
    }
}