class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> list = new ArrayList<>();

        Map<String,List<String>> map = new HashMap<>();

        for(String s : strs){
            char[] ch = s.toCharArray();
            Arrays.sort(ch);
            String ab = new String(ch);

            if(map.containsKey(ab)){
                map.get(ab).add(s);
            }else{
                List<String> arr = new ArrayList<>();
                arr.add(s);
                map.put(ab,arr);
            }
        }

        list.addAll(map.values());
        return list;
    }
}