class Solution {
    public int[][] intervalIntersection(int[][] firstList, int[][] secondList) {
        int i = 0;
        int j = 0;
        List<int[]> list = new ArrayList<>();
        while(i<firstList.length && j<secondList.length){
            int start1 = firstList[i][0];
            int end1 = firstList[i][1];
            int start2 = secondList[j][0];
            int end2 = secondList[j][1];

            if(start2 >= start1){
                if(end1 >= start2){
                    list.add(new int[]{Math.max(start1,start2),Math.min(end1,end2)});
                }

            }else if(start2 <= start1){
                if(end2 >= start1){
                     list.add(new int[]{Math.max(start1,start2),Math.min(end1,end2)});
                }
            }

            if(end2 >= end1){
                i++;
            }else{
                j++;
            }
        }
        return list.toArray(new int[list.size()][]);
    }
}