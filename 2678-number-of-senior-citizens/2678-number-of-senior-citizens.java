class Solution {
    public int countSeniors(String[] details) {
        int count = 0;
        for(String x : details){
            String s = x.substring(11,13);
            int val = Integer.parseInt(s);
            if(val > 60){
                count++;
            }
        }
        return count;
    }
}