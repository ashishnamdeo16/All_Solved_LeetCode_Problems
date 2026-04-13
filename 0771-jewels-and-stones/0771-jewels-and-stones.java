class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int count = 0;
        for(char ch : jewels.toCharArray()){
            int i = 0;
            while(i < stones.length()){
                if(ch == stones.charAt(i)){
                    count++;
                }
                i++;
            }
        }
        return count;
    }

}