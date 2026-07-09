class Solution {
    public int lateFee(int[] daysLate) {
        int panalty = 0;
        
        for(int i=0;i<daysLate.length;i++){
            if(daysLate[i] == 1){
                panalty += 1;
            }else if(daysLate[i] >= 2 && daysLate[i] <= 5){
                panalty += 2 * daysLate[i];
            }else if(daysLate[i] > 5){
                panalty += 3 * daysLate[i];
            }
        }
        return panalty;
    }
}