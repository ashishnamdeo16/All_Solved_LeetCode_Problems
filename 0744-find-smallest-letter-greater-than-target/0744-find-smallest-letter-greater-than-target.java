class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int l = 0;
        int r = letters.length-1;
        char res = letters[l];
        while(l<=r){
            int mid = l + (r-l)/2;
            if(letters[mid] > target){
                res = letters[mid];
                r = mid-1;
            }else{
                l = mid+1;
            }
        }
        return res;
    }
}