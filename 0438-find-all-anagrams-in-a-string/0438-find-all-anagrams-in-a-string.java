class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        HashMap<Character,Integer> pMap = new HashMap<>();
        HashMap<Character,Integer> sMap = new HashMap<>();

        for(char c : p.toCharArray()){
            pMap.put(c,pMap.getOrDefault(c,0)+1);
        }

        int l = 0;
        int r = 0;
        List<Integer> arr = new ArrayList<>();

        while(r<s.length()){
            char ch = s.charAt(r);
            sMap.put(ch,sMap.getOrDefault(ch,0)+1);

            // Maintain window size equal to p length
            if (r - l + 1 > p.length()) {
                char leftChar = s.charAt(l);
                sMap.put(leftChar, sMap.get(leftChar) - 1);

                if (sMap.get(leftChar) == 0) {
                    sMap.remove(leftChar);
                }

                l++;
            }

            // Check current window
            if (r - l + 1 == p.length() && isValid(pMap, sMap)) {
                arr.add(l);
            }

            r++;
        }

        return arr;
    }

    public boolean isValid(Map<Character,Integer> pMap,Map<Character,Integer> sMap){
        if(pMap.size() != sMap.size()){
            return false;
        }
        for(Map.Entry<Character,Integer> entry : sMap.entrySet()){
            if(!pMap.containsKey(entry.getKey()) || !pMap.get(entry.getKey()).equals(entry.getValue())){
                return false;
            }
        }

        return true;
    }
}
