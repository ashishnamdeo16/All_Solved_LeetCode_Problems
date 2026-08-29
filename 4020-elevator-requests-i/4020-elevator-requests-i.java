class Solution {
    public int elevatorRequests(int n, int[] requests) {
        int totalTime = 0;
        int currFloor = 0;

        for(int i=0;i<requests.length;i++){
            totalTime += Math.abs(currFloor - requests[i]);
            currFloor = requests[i];
        }

        return totalTime;
    }
}

// indexs = floors 
// 0 - 5 - 3 = 2 
// 1 -> 
