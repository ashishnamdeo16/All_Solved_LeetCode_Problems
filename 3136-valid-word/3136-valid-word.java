class Solution {
    public boolean isValid(String word) {
        if(word.length() < 3) return false;

        boolean isLetter = false;
        boolean isVowel = false;
        boolean isConstant = false;

        for(char ch : word.toCharArray()){

        if(Character.isLetter(ch)){
            isLetter = true;
            
            if(ch == 'i' || ch == 'a' || ch == 'e' || ch == 'u' || ch == 'o' || ch == 'I' || ch == 'A' || ch == 'E' || ch == 'U' || ch == 'O'){
                isVowel = true;
            }else{
                 isConstant = true;
            }
            }else if(Character.isDigit(ch)) {
                continue; 
            }else {
                return false; 
            }

        }

        return isLetter && isVowel && isConstant;
    }
}