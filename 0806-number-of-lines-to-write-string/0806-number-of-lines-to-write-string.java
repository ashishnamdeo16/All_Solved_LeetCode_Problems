class Solution {
    public int[] numberOfLines(int[] widths, String s) {
        int width  = 0;
        int count = 0;
        for(char ch : s.toCharArray()){
            int ind = ch - 'a';

            if(width + widths[ind] > 100){
               width = 0;
               count++;
            }
      
            width += widths[ind];
        }
        return new int[]{count + 1,width};
    }
}