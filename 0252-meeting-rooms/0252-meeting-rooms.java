class Solution {
    public boolean canAttendMeetings(int[][] intervals) {
        if(intervals.length == 0) return true;
        Arrays.sort(intervals,(a,b) -> a[0] - b[0]);
        int start1 = intervals[0][0];
        int end1 = intervals[0][1];
        for(int i=1;i<intervals.length;i++){
            int start2 = intervals[i][0];
            int end2 = intervals[i][1];
            if(end1 > start2){
                return false;
            }
            start1 = start2;
            end1 = end2;
        }
        return true;
    }
}