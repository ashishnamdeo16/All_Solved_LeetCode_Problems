class Solution {
    public String defangIPaddr(String address) {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        for(char x : address.toCharArray()){
            if(x == '.'){
                sb.append("[.]");
            }else{
                sb.append(x);
            }
            i++;
        }

        return sb.toString();
    }
}