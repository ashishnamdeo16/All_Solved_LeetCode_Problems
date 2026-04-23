class Solution {
    public boolean detectCapitalUse(String word) {
        if(word.matches("[A-Z]+")) return true;
        if(word.matches("[a-z]+")) return true;

        if(Character.isUpperCase(word.charAt(0))){
            int r = 1;
            while(r < word.length()){
                if(!Character.isLowerCase(word.charAt(r))){
                    return false;
                }
                r++;
            }
        }else{
            return false;
        }

        return true;
    }
}

// A word is Set to be using Capitals correctly if below is true
//All letters are Capital
//->Direct Check [A-Z+]
//->Direct Check [a-z+]
//->Pick First Letter and then check all other letters is lowerCase or not