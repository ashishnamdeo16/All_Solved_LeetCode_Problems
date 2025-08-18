class Solution {
    public int lengthOfLastWord(String s) {
        int count =0;
        String x = s.trim();
        int len = 0;
        String[] words = x.split(" ");
        for(int i=0;i<words.length;i++){
            len = 0;
            for(int j=0;j<words[i].length();j++){
                len += 1;
            }
        }
        return len;
    }
}