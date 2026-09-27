class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> anagrams = new ArrayList<>();

        Map<String,List<String>> map = new HashMap<>();

        for(String s : strs){
            char[] arr = s.toCharArray();

            Arrays.sort(arr);
            String c = new String(arr);

            if(map.containsKey(c)){
                map.get(c).add(s);
            }else{
                List<String> list = new ArrayList<>();
                list.add(s);
                map.put(c,list);
            }    
            
        }

        anagrams.addAll(map.values());
        return anagrams;
    }
}