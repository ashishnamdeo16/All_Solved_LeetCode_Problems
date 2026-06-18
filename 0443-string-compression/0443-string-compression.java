class Solution {
    public int compress(char[] chars) {
       StringBuilder sb = new StringBuilder();
       int left = 0;

       while(left < chars.length){
        char ch = chars[left];
        int count = 0;

        while(left < chars.length && chars[left] == ch){
             count++;   
             left++;
        }

        sb.append(ch);
        
        if(count > 1){
            sb.append(count);
        }
        
       } 


       String compressed = sb.toString();

for(int i = 0; i < compressed.length(); i++){
    chars[i] = compressed.charAt(i);
}


        return compressed.length();
    }
}

// Character pick 
// Start counting till we find character and then append and restart with new char 
// 