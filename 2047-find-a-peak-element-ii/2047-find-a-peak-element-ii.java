class Solution {
    public int[] findPeakGrid(int[][] mat) {
        for(int i=0;i<mat.length;i++){
           for (int j = 0; j < mat[0].length; j++) {
                int val = mat[i][j];
                boolean isPeak = true;

                if (i > 0 && mat[i - 1][j] >= val) isPeak = false;        // top
                if (i < mat.length - 1 && mat[i + 1][j] >= val) isPeak = false; // bottom
                if (j > 0 && mat[i][j - 1] >= val) isPeak = false;        // left
                if (j < mat[0].length - 1 && mat[i][j + 1] >= val) isPeak = false; // right

                if (isPeak) return new int[]{i, j};
            }
        }
        return new int[]{-1,-1};
    }
}