class Solution {
    public int maxRepeating(String sequence, String word) {

        StringBuilder sb = new StringBuilder(word);
        int count = 0;
        while(isValid(sb,sequence)){
            sb.append(word);
            count++;
        }
        return count;
    }

    public boolean isValid(StringBuilder sb,String s){
        if(s.contains(sb.toString())){
            return true;
        }
        return false;
    }
}