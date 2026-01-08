class Solution {
    public int firstUniqChar(String s) {
       Map<Character,Integer> map =new HashMap<>();
       int l=0;
       while(l<s.length()){
        char ch = s.charAt(l);
        map.put(ch,map.getOrDefault(ch,0)+1);
        l++;
       }
       for(int i=0;i<s.length();i++){
        if(map.get(s.charAt(i)) == 1){
            return i;
        }
       }
       return -1;
    }
}