class Solution {
    public char repeatedCharacter(String s) {
        int[] freq = new int[26];
        char finalRep = '\0';
        for(char c : s.toCharArray()){
            freq[c - 'a']++;
            if(freq[c - 'a'] > 1){
             return c;
            }
        }
        // Map<Character,Integer> map = new HashMap<>();
        // char finalRep = '\0';
        // for(int i=0;i<s.length();i++){
        //     if(map.containsKey(s.charAt(i))){
        //         return s.charAt(i);
        //     }
        //     map.put(s.charAt(i),1);
        // }
        return finalRep;
    }
}