class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        ArrayList<Boolean> arr = new ArrayList<>();
        int maxCandy = 0;
        for(int Candy : candies){
            if(maxCandy < Candy){
                maxCandy = Candy;
            }
        }
        for(int Candy : candies){
            arr.add(Candy + extraCandies >= maxCandy);
        }
        return arr;
    }
}