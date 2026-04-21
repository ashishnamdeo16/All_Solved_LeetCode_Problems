class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> s1 = new Stack<>();
        for(char sc : s.toCharArray()){
            if(sc == '#'){
                if(!s1.isEmpty()) s1.pop();
            }else{
                s1.push(sc);
            }
        }

        Stack<Character> s2 = new Stack<>();
        for(char tc : t.toCharArray()){
            if(tc == '#'){
                if(!s2.isEmpty()) s2.pop();
            }else{
                s2.push(tc);
            }
        }

        return s1.equals(s2);
    }
}