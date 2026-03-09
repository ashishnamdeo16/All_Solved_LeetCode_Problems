class Solution {
    public int maxNumberOfBalloons(String text) {
        int count = Integer.MAX_VALUE;
        HashMap<Character,Integer> ballon = new HashMap<>();
        char[] word = {'b','a','l','l','o','o','n'};
        for(char x : word){
            ballon.put(x,ballon.getOrDefault(x,0)+1);
        }

        HashMap<Character,Integer> textMap = new HashMap<>();
        for(char ch : text.toCharArray()){
             textMap.put(ch,textMap.getOrDefault(ch,0)+1);
        }

        for(char s : word){
            if(textMap.getOrDefault(s,0) == 0) return 0; 
            int val = (int) (textMap.get(s) / ballon.get(s));
            count = Math.min(count, val);
        }
        return count; 
        }
}