class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        ArrayList<Integer> arr = new ArrayList<>();
        HashMap<Character, Integer> freq = new HashMap<>();
        for (int c = 0; c < p.length(); c++) {
            freq.put(p.charAt(c), freq.getOrDefault(p.charAt(c), 0) + 1);
        }
        int i = 0;
        int j = 0;
        int count = freq.size();
        int k = p.length();
        int res = 0;
        while (j < s.length()) {
            char ch = s.charAt(j);
            if (freq.containsKey(ch)) {
                freq.put(ch, freq.get(ch) - 1);
                if (freq.get(ch) == 0) {
                count--;
            }
            } 
            
            if (j - i + 1 < k) {
                j++;
            } else if (j - i + 1 == k) {
                if (count == 0) {
                    arr.add(i);
                }
                char leftChar = s.charAt(i);
                if (freq.containsKey(leftChar)) {
                    if (freq.get(leftChar) == 0) {
                        count++;
                    }
                    freq.put(leftChar, freq.get(leftChar) + 1);
                }
                i++;
                j++;
            }

        }
        return arr;
    }
}
