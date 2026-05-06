class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {

       HashSet<Integer> set = new HashSet<>();
       int count = 0;
       for(int i=0;i<fruits.length;i++){
        boolean isAdded = false;;
        for(int j=0;j<baskets.length;j++){
            if(baskets[j] >= fruits[i]){
                if(set.contains(j)){
                    continue;
                }
                isAdded = true;
                set.add(j);
                break;
            }
        }
        if(!isAdded){
            count++;
        }
       }
       return count;
    }
}