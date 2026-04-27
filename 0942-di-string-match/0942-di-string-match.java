class Solution {
    public int[] diStringMatch(String s) {
        int dStart = s.length();
        int iStart = 0;
        int[] arr = new int[s.length()+1];

        for(int i =0;i<s.length();i++){
            if(s.charAt(i) == 'D'){
                arr[i] = dStart--;
            }else if(s.charAt(i) == 'I'){
                arr[i] = iStart++;
            }
        }

         arr[s.length()] = iStart;

        return arr;
    }
}