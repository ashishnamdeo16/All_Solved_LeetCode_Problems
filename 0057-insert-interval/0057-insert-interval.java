class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        
        List<int[]> list = new ArrayList<>();
        boolean isInserted = false;
        for(int i=0;i<intervals.length;i++){
            if(!isInserted && intervals[i][0] > newInterval[0]){
                list.add(newInterval);
                isInserted = true;
            }
            list.add(intervals[i]);
        }

        if(!isInserted) list.add(newInterval);
        
        List<int[]> res = new ArrayList<>();
        int start1 = list.get(0)[0];
        int end1 = list.get(0)[1];
        for(int j=1;j<list.size();j++){
             int start2 = list.get(j)[0];
             int end2 = list.get(j)[1];
             if(end1 >= start2){
                end1 = Math.max(end1,end2);
                continue;
             }
             res.add(new int[]{start1,end1});
             start1 = start2;
             end1 = end2 ;
        }
        res.add(new int[]{start1,end1});
        return res.toArray(new int[res.size()][]);
    }
}