class Solution {
    public int lengthOfLongestSubstringKDistinct(String s, int k) {
        HashMap<Character,Integer> map = new HashMap<>();
        int maxlen = 0;
        int l =0;
        int r =0;

        while(r < s.length()){
            char ch = s.charAt(r);
            map.put(ch,map.getOrDefault(ch,0)+1);
            while(map.size() > k){
                map.put(s.charAt(l),map.get(s.charAt(l))-1);
                if(map.get(s.charAt(l)) == 0){
                    map.remove(s.charAt(l));
                }
                l++;
            }
            maxlen = Math.max(maxlen,r-l+1);
            r++;
        }

        return maxlen;
    }
}