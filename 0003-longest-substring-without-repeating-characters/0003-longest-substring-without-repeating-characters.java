class Solution {
    public int lengthOfLongestSubstring(String s) {
       HashMap<Character,Integer> map = new HashMap<>();
       int l = 0;
       int r = 0;
       int len = Integer.MIN_VALUE;
       StringBuilder sb = new StringBuilder(s);

       while(r < s.length()){
            char ch = s.charAt(r);
            map.put(ch,map.getOrDefault(ch,0)+1);

            while(!isValid(map)){
                map.put(s.charAt(l),map.get(s.charAt(l)) - 1);
                if(map.get(s.charAt(l)) == 0){
                    map.remove(s.charAt(l));
                }
                l++;
            }

            len = Math.max(len,r - l + 1);
            r++;
       }
        return len == Integer.MIN_VALUE ? 0 : len;
    }
    public boolean isValid(HashMap<Character,Integer> map){
        for(Map.Entry<Character,Integer> entry : map.entrySet()){
            if(entry.getValue() > 1){
                return false;
            }
        }
        return true;
    }
}