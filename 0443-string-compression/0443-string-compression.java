class Solution {
    public int compress(char[] chars) {
        StringBuilder sb = new StringBuilder();
        sb.append(chars[0]);
        int count = 1;
        int r = 1;
        while(r < chars.length){
            char ch = chars[r];
            char prvCh = chars[r-1];
            if(ch == prvCh){
                 count++;
            }else{
                 if(count > 1){
                    sb.append(count);
                }
                count = 1;
                sb.append(ch);
            }
            r++;
        }

        if(count > 1){
            sb.append(count);
        }

        for(int i=0;i<sb.length();i++){
            chars[i] = sb.charAt(i);
        }

        return sb.length();
    }
}