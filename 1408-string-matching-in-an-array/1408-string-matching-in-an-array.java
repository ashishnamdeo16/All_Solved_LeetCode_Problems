class Solution {
    public List<String> stringMatching(String[] words) {
        List<String> arr = new ArrayList<>();
        Set<String> set = new HashSet<>();
        for(String s : words){
            for(String x :  words){
                if(x.equals(s)){
                    continue;
                }
                if(x.contains(s)){
                    if(!set.contains(s)){
                        arr.add(s);
                    }
                    set.add(s);
                }
            }
        }

        return arr;
    }

}