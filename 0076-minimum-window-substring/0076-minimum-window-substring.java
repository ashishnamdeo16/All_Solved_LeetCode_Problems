class Solution {
    public String minWindow(String s, String t) { 
        int[] needed = new int[256];
        int[] have = new int[256];
        int minlen = Integer.MAX_VALUE;
        int start = 0;

        for(char x : t.toCharArray()){
            needed[x]++;
        }
        int l = 0;
        int r =0;
        char[] arr = s.toCharArray();

        while(r < arr.length){
              have[arr[r]]++;
              while(isValid(have,needed)){
                 have[arr[l]]--;
                 int len = r - l + 1;
                 if(minlen > len){
                    minlen = len;
                    start = l;
                 }
                 l++;
             }
             r++;   
        }
        return minlen == Integer.MAX_VALUE ? "" : s.substring(start,start+minlen);
    }


    public boolean isValid(int[] have, int [] needed){
        for(int i = 0;i<needed.length;i++){
            if(have[i] < needed[i]){
                return false;
            }
        }
        return true;
    }
}