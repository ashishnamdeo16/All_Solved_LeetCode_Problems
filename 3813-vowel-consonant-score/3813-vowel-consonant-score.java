class Solution {
    public int vowelConsonantScore(String s) {
        int l = 0;
        int vowelCount = 0;
        int contantCount = 0;
        int score = 0;
       while(l<s.length()){
        char ch = s.charAt(l);
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
            vowelCount++;
        }else if(Character.isLetter(ch)){
            contantCount++;
        }
        l++;
       }

       if(contantCount > 0){
          score = (int) Math.floor(vowelCount/contantCount);
       }
       
       return score;
    }
}