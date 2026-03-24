class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        int m = matrix.length;
        int n = matrix[0].length;
        int low = matrix[0][0];
        int high = matrix[m-1][n-1];
        int res = -1;
        while(low<= high){
            int mid = low + (high - low)/2;
            int ans = findCount(matrix,m,n,mid);
            if(ans < k){
                  low = mid + 1;
            }else{
                 res = mid;
                high = mid -1;
            }
        }
        return res;
    }
    public int findCount(int[][] matrix,int m,int n,int mid){
        int row = 0;
        int col = n-1;
        int count = 0;
        while(row < m && col >= 0){
            if(matrix[row][col] <= mid){
                count = count + col + 1;
                row++;
            }else{
                col--;
            }
        }
        return count;
    }
}