class Solution {
    public String toGoatLatin(String sentence) {
        String[] arr = sentence.split(" ");

        StringBuilder sb = new StringBuilder();

        for(int i=0;i<arr.length;i++){
          
            char ch = arr[i].charAt(0);
            if( ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U'){
                sb.append(arr[i]);
                sb.append("ma");
            }else{
                sb.append(arr[i],1,arr[i].length());
                sb.append(ch);
                sb.append("ma");
            }
            int l = i;

            while(l >= 0){
                sb.append('a');
                l--;
            }

            if(i != arr.length -1) sb.append(" ");
        }

        return sb.toString();
    }
}