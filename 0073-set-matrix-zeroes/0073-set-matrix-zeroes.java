class Solution {
    public void setZeroes(int[][] matrix) {
        Set<Integer> rows = new HashSet<>();
        Set<Integer> columns = new HashSet<>();

        for(int i = 0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                if(matrix[i][j] == 0){
                    rows.add(i);
                    columns.add(j);
                }
            }
        }

        for(int row : rows){
            for(int k=0;k<matrix[0].length;k++){
                matrix[row][k] = 0;
            }
        }

         for(int col : columns){
            for(int k=0;k<matrix.length;k++){
                matrix[k][col] = 0;
            }
        }
    }
}