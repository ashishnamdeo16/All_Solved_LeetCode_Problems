class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        int len = 0;
        boolean oddFound = false;
        for(char x : s.toCharArray()){
            map.put(x,map.getOrDefault(x,0)+1);
        }

        for(int val : map.values()){
            if(val % 2 == 0){
                len += val;
            }else{
                len += val - 1;
                oddFound = true;
            }
        }

        if(oddFound) return ++len;

        return len;
    }
}