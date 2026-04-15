class Solution {
    public int minAbsoluteDifference(int[] nums) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i=0;i<nums.length;i++){
            for(int j= i+1;j<nums.length;j++){
                if( (nums[i] == 1 && nums[j] == 2) || (nums[i] == 2 && nums[j] == 1)){
                    pq.offer(Math.abs(i-j));
                }
            }
        }
        if(!pq.isEmpty()) return pq.poll();
        return -1;
    }
}