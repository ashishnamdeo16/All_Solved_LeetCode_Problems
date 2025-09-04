class Solution {
    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) return false;
        Map<Character,Character> a = new HashMap<>();
        Map<Character,Character> b = new HashMap<>();

        for(int i=0;i<s.length();i++){
            char chS = s.charAt(i);
            char chT = t.charAt(i);

            if(b.containsKey(chS)){
                if (b.get(chS) != chT) return false;
            }else{
                b.put(chS,chT);
            }

            if(a.containsKey(chT)){
                 if (a.get(chT) != chS) return false;
            }else{
                a.put(chT,chS);
            }
        }
        return true;


        //Brute Force Or My Own
        // Map<Character,Integer> a = new HashMap<>();
        // Map<Character,Integer> b = new HashMap<>();
        // int i=0;
        // int j=0;
        // while(i<s.length()){
        //     char ch = s.charAt(i);
        //     a.put(ch,a.getOrDefault(ch,0)+1);
        //     i++;
        // }
        //  while(j<t.length()){
        //     char ch = t.charAt(j);
        //     b.put(ch,b.getOrDefault(ch,0)+1);
        //     j++;
        // }
        // for(Map.Entry<Character,Integer> en : a.entrySet()){
        //     if(!b.containsValue(en.getValue())){
        //         return false;
        //     }
        // }
        // return true;
    }
}