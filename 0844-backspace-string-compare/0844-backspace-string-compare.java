class Solution {
    public boolean backspaceCompare(String s, String t) {
        StringBuilder sb = new StringBuilder();
        StringBuilder st = new StringBuilder();

        for(char x : s.toCharArray()){
            if(x == '#'){
               if (sb.length() > 0) {
                    sb.deleteCharAt(sb.length() - 1);
                }
            }else{
                sb.append(x);
            }
        }

        for(char z : t.toCharArray()){
              if(z == '#'){
                if (st.length() > 0) {
                    st.deleteCharAt(st.length() - 1);
                }
            }else{
                st.append(z);
            }
        }


        return sb.toString().equals(st.toString());
    }
}