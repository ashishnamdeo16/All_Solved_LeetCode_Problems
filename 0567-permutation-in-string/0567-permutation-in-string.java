class Solution {
    public boolean checkInclusion(String s1, String s2) {
       if(s1.length() > s2.length()) return false;
       int[] freq = new int[26];
       int[] arr = new int[26];
       for(char s : s1.toCharArray()){
          freq[s - 'a']++;
       }

       int right = 0;
       int left = 0;

       while(right < s2.length()){
        arr[s2.charAt(right) - 'a']++;
        if(right - left + 1 < s1.length()){
            right++;
        }else if(right - left + 1 == s1.length()){
            if(isPer(freq,arr)) return true;
            arr[s2.charAt(left) - 'a']--;
            left++;
            right++;
        }
       }

       return false; 
    }

    public boolean isPer(int[] freq,int[] arr){
        for(int i=0;i<freq.length;i++){
            if(freq[i] != arr[i]){
                return false;
            }
        }
        return true;
    }
}