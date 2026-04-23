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

        for(Character c : s.toCharArray()){
            if(!set.contains(c)){
                return false;
            }
        }

        return true;
    }
}