class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int right = 0;
        int left = 0;
        int maxElement = Integer.MIN_VALUE;
        ArrayList<Integer> list = new ArrayList<>();
        
        PriorityQueue<int[]> pq = new PriorityQueue<>(
         (a, b) -> b[0] - a[0]
        );

        while(right < nums.length){
            pq.offer(new int[]{nums[right],right});
            if(right - left + 1 < k){
                right++;
            }else if(right - left + 1 == k){
                while(pq.peek()[1] < left){
                  pq.poll();
                }
                list.add(pq.peek()[0]);
                left++;
                right++;
            }
        }

        int[] arr = new int[list.size()];
        for(int i=0;i<arr.length;i++){
            arr[i] = list.get(i);
        }

        return arr;
    }
}