class Solution {
    public int countKConstraintSubstrings(String s, int k) {
        int l = 0;
        int r = 0;
        int count = 0;
        int zeroCount = 0;
        int oneCount = 0;

        while(r < s.length()){
            if(s.charAt(r) == '0'){
                zeroCount++;
            }else{
                oneCount++;
            }

            while(zeroCount > k && oneCount > k){
                if(s.charAt(l) == '0'){
                    zeroCount--;
                }else{
                    oneCount--;
                }
                l++;
            }

            count += r - l + 1;
            r++;
        }

        return count;
    }
}
