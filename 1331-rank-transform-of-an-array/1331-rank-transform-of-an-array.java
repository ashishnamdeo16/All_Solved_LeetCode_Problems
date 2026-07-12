class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int[] narr = arr.clone();
        int[] farr = new int[arr.length];

        Map<Integer,Integer> map = new HashMap<>();
        Arrays.sort(narr);
        
        int rank = 1;

        for(int i=0;i<arr.length;i++){
           if (!map.containsKey(narr[i])) {
                map.put(narr[i], rank++);
            }
        }

        for(int j = 0; j<arr.length ; j++){
            farr[j] = map.get(arr[j]);
        }
        
        return farr;   
    } 
     
}
// 30 20 10 
// 10 20 30
//  1  2  3