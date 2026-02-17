class Solution {
    int[] px = {-1,0,1,0};
    int[] py = {0,-1,0,1};
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int r = image.length;
        int c = image[0].length; 
        int imageColor = image[sr][sc];
        if(imageColor == color) return image;

        dfs(image,imageColor,sr,sc,color,r,c);
        return image;
    }

    public void dfs(int[][] image,int imageColor,int i,int j,int color,int r,int c){
     if(i<0 || j < 0 || i >= r || j >= c || image[i][j] != imageColor){
        return;
     }

     image[i][j] = color;

     for(int k=0;k<4;k++){
        int ii = i+px[k];
        int jj = j+py[k];
        dfs(image,imageColor,ii,jj,color,r,c);
     }
    }
}