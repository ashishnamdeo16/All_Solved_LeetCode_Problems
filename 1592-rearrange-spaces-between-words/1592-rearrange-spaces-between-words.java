class Solution {
    public String reorderSpaces(String text) {
        if(text.length() < 2) return text;
        int count = 0;
        for(int i=0;i<text.length();i++){
            if(text.charAt(i) == ' '){
                count++;
            }
        }
        String newText = text.trim();
        String[] arr = newText.split("\\s+");
        int len = arr.length;
        StringBuilder sb = new StringBuilder();


         if (len == 1) {
            sb.append(arr[0]);
            while (count > 0) {
                sb.append(' ');
                count--;
            }
            return sb.toString();
        }

        int space = count / (len - 1);
        int extra = count % (len - 1);


            for(int i=0;i<arr.length;i++){
                
            sb.append(arr[i]);
            if(i != arr.length-1){
                int temp = space;
                while(temp > 0){
                sb.append(' ');
                temp--;
            }
            }
           }

        while(extra > 0){
            sb.append(' ');
            extra--;
        }

        return sb.toString();
    }
}