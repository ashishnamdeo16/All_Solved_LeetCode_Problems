class Solution {
    public int[] scoreValidator(String[] events) {
        int score = 0;
        int counter = 0;
        for(String x : events){
            if(counter < 10){
            if(x.equals("WD") ||  x.equals("NB")){
                score++;
            }else if(x.equals("W")){
                    counter++;
            }else{
                score += Integer.parseInt(x);
            }
            }else{
                break;
            }
        }

        return new int[]{score,counter};
    }
}