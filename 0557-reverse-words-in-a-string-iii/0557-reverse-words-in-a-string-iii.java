class Solution {
    public String reverseWords(String s) {
        char[] arr = s.toCharArray();
        int l = 0;
        for(int i=0;i<arr.length;i++){
          if(Character.isWhitespace(arr[i])){
            swap(l,i-1,arr);
            l = i+1;
          }else if(i == arr.length-1){
            swap(l,i,arr);
          }

        }
        String str = new String(arr);
        return str;
    }

    public void swap(int x,int y,char[] arr){
        while(x<y){
        char temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
        x++;
        y--;
        }
    }
}