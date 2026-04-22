class Solution {
    public int[] shortestToChar(String s, char c) {
        int i =0;
        int[] arr = new int[s.length()];
        
        List<Integer> list = new ArrayList<>();

        for(int k =0;k<s.length();k++){
            char ch = s.charAt(k);
            if(ch == c){
                list.add(k);
            }
        }

        while(i<s.length()){
            int res = Integer.MAX_VALUE;
            if(s.charAt(i) == c){
                arr[i] = 0;
                i++;
                continue;
            }
            
            for(int j=0;j<list.size();j++){
               res = Math.min(res, Math.abs(i-list.get(j)));
            }


            arr[i] = res;
            i++;
        }
        return arr;
    }
}