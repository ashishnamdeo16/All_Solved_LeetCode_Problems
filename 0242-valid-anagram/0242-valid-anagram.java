class Solution {
    public boolean isAnagram(String s, String t) {
            if (s.length() != t.length()) {
        return false;
        }
        int[] freq = new int[26];
        int[] freq2 = new int[26];

        for(int i=0;i<s.length();i++){
            freq[s.charAt(i) - 'a']++;
            freq2[t.charAt(i) - 'a']++;
        }

        for(int i=0;i<26;i++){
            if(freq[i] != freq2[i]){
                return false;
            }
        }

        return true;
        
        
    //    if(s.length() != t.length()) return false;
    //    HashMap<Character,Integer> map1 = new HashMap<>();
    //    HashMap<Character,Integer> map2 = new HashMap<>();

    //    for(char q : s.toCharArray()){
    //         map1.put(q,map1.getOrDefault(q,0)+1);
    //    }

    //    for(char m : t.toCharArray()){
    //         map2.put(m,map2.getOrDefault(m,0)+1);
    //    }

    //    return map1.equals(map2);
    }
}