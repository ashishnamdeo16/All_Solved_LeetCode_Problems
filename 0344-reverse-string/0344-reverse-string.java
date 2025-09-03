class Solution {
    public void reverseString(char[] s) {
        int i=0;int j=s.length-1;
        while(i<j){
            char temp = s[i];
            s[i] = s[j];
            s[j] = temp;
            i++;
            j--;
        }

        //Brute Force
        // for(int i=0;i<s.length/2;i++){
        //     char temp = s[i];
        //     s[i] = s[s.length - i -1];
        //     s[s.length - i -1] = temp;
        // }
    }
}