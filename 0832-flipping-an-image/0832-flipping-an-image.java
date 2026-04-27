class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        
        for(int i=0;i<image.length;i++){
            int l = 0;
            int r = image[i].length-1;

            while(l<=r){
                int temp = image[i][l];
                image[i][l] = image[i][r];
                image[i][r] = temp;

                if (l == r) {
                image[i][l] ^= 1;  // invert once
                } else {
                    image[i][l] ^= 1;
                    image[i][r] ^= 1;
                }

                l++;
                r--;
            }

            // int k=0;
            // while(k < image[i].length){
            //     if(image[i][k] == 0){
            //         image[i][k] = 1;
            //     }else{
            //          image[i][k] = 0;
            //     }
            //     k++;
            // }
        }

        return  image;
    }
}