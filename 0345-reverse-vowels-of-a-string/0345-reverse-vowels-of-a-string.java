class Solution {
    public String reverseVowels(String s) {
        char[] arr = s.toCharArray();
        int i =0;
        int j = arr.length-1;
        while(i<=j){
        if(arr[i] == 'I' || arr[i] == 'A' || arr[i] == 'E' || arr[i] == 'O'||arr[i] == 'U'||arr[i] == 'a'|| arr[i] == 'e'||arr[i] == 'i'||arr[i] == 'o' || arr[i] == 'u'){
            if(arr[j] == 'I' || arr[j] == 'A' || arr[j] == 'E' || arr[j] == 'O'||arr[j] == 'U'||arr[j] == 'a'|| arr[j] == 'e'||arr[j] == 'i'||arr[j] == 'o' || arr[j] == 'u'){
                    char temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }else{
                j--;
            }
            }else{
          i++;
            }
        }
       String a = String.valueOf(arr);
       return a;
    }
}