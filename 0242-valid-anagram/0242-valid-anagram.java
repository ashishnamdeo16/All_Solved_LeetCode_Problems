class Solution {
    public boolean isAnagram(String s, String t) {
       if(s.length() != t.length()) return false;
       HashMap<Character,Integer> mapS = new HashMap<>();
       HashMap<Character,Integer> mapT = new HashMap<>();

        for(char x : s.toCharArray()){
         mapS.put(x,mapS.getOrDefault(x,0) + 1);
        } 

        for(char y : t.toCharArray()){
         mapT.put(y,mapT.getOrDefault(y,0) + 1);
        } 

        if(mapS.equals(mapT)) return true;

        return false;

    }
}