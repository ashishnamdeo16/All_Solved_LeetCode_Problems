class Solution {
    public boolean lemonadeChange(int[] bills) {
        int bill_5 = 0;
        int bill_10 = 0;
        int bill_20 = 0;

        for(int x : bills){
            if(x == 5){
                bill_5++;
            }else if(x == 10){
                if(bill_5 > 0){
                    bill_5--;
                }else{
                    return false;
                }
                bill_10++;
            }else if(x == 20){
                if(bill_10 > 0 && bill_5 > 0){
                    bill_5--;
                    bill_10--;
                }else if(bill_5 >= 3){
                    bill_5 -= 3;
                }else{
                    return false;
                }
                bill_20++;
            }
        }
        return true;
    }
}

//Every customer need to pay 5
// If customer pays 10 we need to give 5 back 
// if customer pays 20 we need to give 15 back

