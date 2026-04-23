class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        Set<Character> set = new HashSet<>();

        for(Character s : allowed.toCharArray()){
            set.add(s);
        }

        int count = 0;
        
        for(String s : words){
             if(funcFind(s,set)) count++;
        }

        return count;
    }

    public boolean funcFind(String s,Set set){
        Set<Character> needs = new HashSet<>();

         for(Character c : s.toCharArray()){
            needs.add(c);
        }

        int count = 0;

        for(Character ch : needs){
            if(set.contains(ch)){
               count++;
            }
        }

        return count == needs.size();
    }
}