class Solution {
    public String filterCharacters(String s, int k) {
        StringBuilder sb = new StringBuilder();
        int[] freq = new int[26];
        Arrays.fill(freq,0);
        for(char ch : s.toCharArray()){
            freq[ch - 'a']++;
        }

        for(int i=0;i<s.length();i++){
            if(freq[s.charAt(i) - 'a'] < k){
                sb.append(s.charAt(i));
            }
        }   

        return sb.toString();
    }
}

