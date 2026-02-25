class Solution {
    public String minWindow(String s, String t) { 
       int[] have = new int[256];
       int[] needed = new int[256];
       for(char x : t.toCharArray()){
            needed[x]++;
       }
       int high =0;
       int low =0;
       int start = 0;
       int min = Integer.MAX_VALUE;
    while(high<s.length()){
        char ch = s.charAt(high);
        have[ch]++;
        while(isValid(have,needed)){
            int len = high - low + 1;
            if (len < min) {
            min = len;
            start = low;
            }
            have[s.charAt(low)]--;
            low++;
        }
        high++;
    }
    return min == Integer.MAX_VALUE ? "" : s.substring(start,start + min);
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