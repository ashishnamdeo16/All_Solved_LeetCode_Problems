class Solution {
    public String minWindow(String s, String t) { 
        int[] arr = new int[256];
        int[] freq = new int[256];

        for(char ch : t.toCharArray()){
            arr[ch]++;
        }
        int right = 0;
        int left = 0;
        int start = 0;
        int min = Integer.MAX_VALUE;

        while(right < s.length()){
            freq[s.charAt(right)]++;
            while(isValid(freq,arr)){
                int len = right - left + 1;
                if(len < min){
                    min = len;
                    start = left;
                } 
                freq[s.charAt(left)]--;
                left++;
            }
            right++;
        }

        return min == Integer.MAX_VALUE ? "" : s.substring(start,start+min);
    }
    public boolean isValid(int[] freq,int[] arr){
        for(int i=0;i<arr.length;i++){
            if(freq[i] < arr[i]){
                return false;
            }
        }
        return true;
    }
}