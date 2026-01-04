class Solution {
    public int lengthOfLongestSubstringKDistinct(String s, int k) {

        //Intializing all the required Variables
        HashMap<Character,Integer> map = new HashMap<>();
        int i=0;
        int j=0;
        int maxLength = 0;

         if (k >= s.length()) {
            return s.length();
        }
        //Starting Loop for Calculations
        while(j<s.length()){
            char ch=s.charAt(j);
            map.put(ch,map.getOrDefault(ch,0)+1);
            if(map.size() <= k){ // Condition Satisfied
                maxLength = Math.max(maxLength,j-i+1);
                j++;
            }else if(map.size() > k){
                while(map.size() > k){
                    char ch1= s.charAt(i);
                    map.put(ch1,map.get(ch1)-1);
                    if(map.get(ch1) == 0 ){
                        map.remove(ch1);
                    }
                    i++;
                }
                j++;
            }   
        }
        return maxLength;
    }
}