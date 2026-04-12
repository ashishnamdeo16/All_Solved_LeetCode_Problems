class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        StringBuilder sb = new StringBuilder();
        for(String x : words){
            char ch = giveMeChar(x,weights);
            sb.append(ch);
        }
        return sb.toString();
    }

    public char giveMeChar(String s,int[] weights){
        int sum = 0;
        for(char ch : s.toCharArray()){
            int index = ch - 'a';
            sum += weights[index];
        }

        int val = sum % 26;
        int k = 'z' - val;
        
        return (char) k;
    }
}