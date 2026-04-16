class Solution {
    public int earliestTime(int[][] tasks) {
        int min = Integer.MAX_VALUE;
        for(int[] x : tasks){
            int a = x[0];
            int b = x[1];
            min = Math.min(a+b,min);
        }
        return min;
    }
}