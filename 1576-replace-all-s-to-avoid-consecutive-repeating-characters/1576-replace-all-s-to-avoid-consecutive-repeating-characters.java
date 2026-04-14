class Solution {
    public String modifyString(String s) {
        StringBuilder sb = new StringBuilder(s);
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(c == '?'){
                char pre = (i > 0) ? sb.charAt(i - 1) : '#';
                char next = (i < s.length() - 1) ? sb.charAt(i + 1) : '#';
                    int a = 0;
                    while(a<26){
                        char ch = (char) ('a' + a);
                        if(ch != pre && ch != next){
                            sb.setCharAt(i,ch);
                            break;
                        }
                        a++; 
                    }
            }   
        }
        return sb.toString();
    }
}