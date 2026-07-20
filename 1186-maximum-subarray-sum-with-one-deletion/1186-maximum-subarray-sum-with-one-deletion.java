class Solution {
    public int maximumSum(int[] arr) {
       int res = arr[0];
       int noDelete = arr[0];
       int oneDelete = Integer.MIN_VALUE;

       for(int i=1;i<arr.length;i++){
            int prvNoDelete = noDelete;
            int prvOneDelete = oneDelete;

            noDelete = Math.max(noDelete + arr[i],arr[i]);

            int v2 = 0;
            
            if(prvOneDelete == Integer.MIN_VALUE){
                v2 = Integer.MIN_VALUE;
            }else{
                v2 = prvOneDelete + arr[i];
            }

            //prvNoDelete = Means we are deleting the current element itself
            oneDelete = Math.max(prvNoDelete,v2);

            res = Math.max(Math.max(noDelete,oneDelete),res);
       }

       return res;
    }
}