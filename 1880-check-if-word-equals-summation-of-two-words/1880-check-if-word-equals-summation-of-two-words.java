class Solution {
    public boolean isSumEqual(String firstWord, String secondWord, String targetWord) {
        int num1 = funcToCal(firstWord);
        int num2 = funcToCal(secondWord);
        int num3 = funcToCal(targetWord);
        if(num1 + num2 == num3) return true;
        return false;
    }
    public int funcToCal(String s){
        int intVal = 0;
        for(char ch : s.toCharArray()){
            int val = 'a' - ch;
            intVal = intVal*10 + val;
        }

        return intVal;
    }
}