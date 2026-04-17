class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> arr = new ArrayList<>();
         int l = 0;
        for(String ch : words){
            int i = 0;
            while(i < ch.length()){
                if(ch.charAt(i) == x){
                    arr.add(l);
                    break;
                }
                i++;
            }
            l++;
        }
        return arr;
    }
}