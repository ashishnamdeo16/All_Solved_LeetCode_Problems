class Solution {
    public boolean isPrefixString(String s, String[] words) {
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<words.length;i++){
            if(s.contains(words[i]) && sb.length() < s.length()){
                sb.append(words[i]);
            }else{
                break;
            }
        }

        return s.equals(sb.toString());
    }
}