class Solution {
    public int maximumLengthSubstring(String s) {
        Map<Character,Integer> map = new HashMap<>();
        int right = 0;
        int left = 0;
        int res = Integer.MIN_VALUE;

        while(right < s.length()){
            char ch = s.charAt(right);
            map.put(ch,map.getOrDefault(ch,0)+1);
            
            while(map.get(ch) > 2){
                char chleft = s.charAt(left);
                map.put(chleft,map.get(chleft) - 1);
                if(map.get(chleft) == 0){
                    map.remove(chleft);
                }
                
                left++;
            }

            res = Math.max(res,right - left + 1);
            right++;
        }

        return res;
    }
}

// b - 
// c - 1
 