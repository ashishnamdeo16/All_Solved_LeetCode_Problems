class Solution {
    public boolean canAliceWin(int[] nums) {
        int aliceSum1 = 0;
        int aliceSum2 = 0;

        for(int x : nums){
            if(x >= 10){
                aliceSum2 += x;
            }else{
                aliceSum1 += x;
            }
        }

        int alFinal = 0;  
        int bobV = 0;

        if(aliceSum2 >= aliceSum1){
            alFinal = aliceSum2;
            for(int x : nums){
                if(x < 10){
                    bobV += x;
                }
            }
        }else{
            alFinal = aliceSum1;
             for(int x : nums){
                if(x > 10){
                    bobV += x;
                }
            }
        }

        if(alFinal > bobV){
            return true;
        }

        return false;
    }
}
