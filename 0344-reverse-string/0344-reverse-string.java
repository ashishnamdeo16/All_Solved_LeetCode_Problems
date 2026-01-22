class Solution {
    public void reverseString(char[] s) {
        //Using Recursion
        int l =0;
        int r = s.length-1;
        reverse(s,l,r);
        // int l =0;
        // int r = s.length-1;
        // while(l<r){
        //     char temp = s[l];
        //     s[l] = s[r];
        //     s[r] = temp;
        //     l++;
        //     r--;
        // }    
    }
    public static void reverse(char[] s,int l, int r){
        if(l >= r){
            return;
        }
        char temp = s[r];
        s[r] = s[l];
        s[l] = temp;
        reverse(s,l+1,r-1);
    }
}