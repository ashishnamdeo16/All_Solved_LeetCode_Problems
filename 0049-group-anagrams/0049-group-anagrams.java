class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
         List<List<String>> listOflist = new ArrayList<>();
         Map<String,List<String>> map = new HashMap<>();
         int i =0;
         while(i<strs.length){
            char[] charArray = strs[i].toCharArray();
            Arrays.sort(charArray);
            String c = new String(charArray);
            if(map.containsKey(c)){
                map.get(c).add(strs[i]);
            }else{
                List<String> list = new ArrayList<>();
                list.add(strs[i]);
                map.put(c, list);
            }
            i++;
         }   
        listOflist.addAll(map.values());
        return listOflist;
    }
}