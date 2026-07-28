class Solution {
    public int oddCells(int m, int n, int[][] indices) {
        int[][] arr = new int[m][n];

        int oddCount = 0;

       for(int[] x : indices){
            int row = x[0];
            int col = x[1];

            for(int i=0;i<m ;i++){
                arr[i][col]++;
            } 

            for(int j=0;j<n ;j++){
                arr[row][j]++;
            } 
       }


       for(int i=0;i<arr.length;i++){
        for(int j=0;j<arr[0].length;j++){
            if(arr[i][j] % 2 != 0){
                oddCount++;
            }
        }
       }

        return oddCount;
    }
}
//.  j0 j1 
//   c1  c2 j = 1
//r1 0   0  i = 0 
//r2 0   0

//   c1  c2  
//r1 1   1 
//r2 0   1


//   c1  c2  
//r1 1   1 
//r2 0   1