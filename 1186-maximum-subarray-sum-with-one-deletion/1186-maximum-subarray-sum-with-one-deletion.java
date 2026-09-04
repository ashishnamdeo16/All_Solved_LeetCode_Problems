class Solution {
    public int maximumSum(int[] arr) {
       int oneDelete = Integer.MIN_VALUE;
       int noDelete = arr[0];
       int res = arr[0];

       for(int i = 1;i < arr.length; i++){
            int prevOneDelete = oneDelete;
            int prevNoDelete = noDelete;

            noDelete = Math.max(arr[i],arr[i] + noDelete);

            int v2 = 0;

            if(prevOneDelete == Integer.MIN_VALUE){
                v2 = arr[i];
            }else{
                v2 = prevOneDelete + arr[i];
            }

            oneDelete = Math.max(v2,prevNoDelete);

            res = Math.max(Math.max(oneDelete,noDelete),res);

       }


       return res;

    }
}