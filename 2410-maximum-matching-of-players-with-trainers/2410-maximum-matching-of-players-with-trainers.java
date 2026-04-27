class Solution {
    public int matchPlayersAndTrainers(int[] players, int[] trainers) {
        Arrays.sort(players);
        Arrays.sort(trainers);

        int l = 0;
        int j = 0;

        // int count = 0;
        while(l < players.length && j < trainers.length){
            if(players[l] <= trainers[j]){
                // count++;
                l++;
                j++;
            }else{  
                j++;
            }
        }

        return l;
    }
}