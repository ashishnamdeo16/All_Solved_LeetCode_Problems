class Solution {
    public char findTheDifference(String s, String t) {
        HashMap<Character,Integer> arr = new HashMap<>();
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            arr.put(c,arr.getOrDefault(c,0)+1);
        }
         for(int i=0;i<t.length();i++){
            char c = t.charAt(i);
            if (!arr.containsKey(c) || arr.get(c) == 0) {
                return c;  // extra char found
            } else {
                arr.put(c, arr.get(c) - 1);
            }
  
        }
        
        return 0;
    }
}