class Solution {
    public int maximumSum(int[] arr) {
        int res = arr[0];
        int noDelete = arr[0];
        int oneDelete = Integer.MIN_VALUE;

        for(int i=1;i<arr.length;i++){
            int prevNoDelete = noDelete;
            int prevOneDelete = oneDelete;
            noDelete = Math.max(noDelete + arr[i], arr[i]);
            if(prevOneDelete == Integer.MIN_VALUE){
                prevOneDelete = arr[i];
            }else{
                prevOneDelete = prevOneDelete + arr[i];
            }
            oneDelete = Math.max(prevOneDelete,prevNoDelete);
            res = Math.max(res,Math.max(oneDelete,noDelete));
        }

        return res;
    }
}