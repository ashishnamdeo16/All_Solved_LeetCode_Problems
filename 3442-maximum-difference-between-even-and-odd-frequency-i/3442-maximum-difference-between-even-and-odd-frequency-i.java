class Solution {
    public int maxDifference(String s) {
        int[] freq = new int[26];
        Arrays.fill(freq,0);

        for(char c : s.toCharArray()){
            freq[c - 'a']++;
        }

        int odd = Integer.MIN_VALUE;
        int even = Integer.MAX_VALUE;

        for(char ch : s.toCharArray()){
            if(freq[ch - 'a'] % 2 == 0 && freq[ch - 'a'] != 0){
                even = Math.min(even,freq[ch - 'a']);
            }else if(freq[ch - 'a'] % 2 != 0 && freq[ch - 'a'] != 0){
                odd = Math.max(odd,freq[ch - 'a']);
            }
        }
       
       if(odd == Integer.MIN_VALUE || even == Integer.MAX_VALUE){
        return -1;
       }

        return odd - even;

    }
}