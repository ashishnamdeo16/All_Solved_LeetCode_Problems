class Solution {
    public int maxPower(String s) {
        int l =0;
        int r =0;
        StringBuilder sb = new StringBuilder();
        int res = 1;
        sb.append(s.charAt(0));
        for(int i=1;i<s.length();i++){
            sb.append(s.charAt(i));
            if(s.charAt(i) != s.charAt(i-1)){
                sb.setLength(0);
                sb.append(s.charAt(i));
                l=i;
            }
            res = Math.max(res,sb.length());
        }
        return res;
    }
}