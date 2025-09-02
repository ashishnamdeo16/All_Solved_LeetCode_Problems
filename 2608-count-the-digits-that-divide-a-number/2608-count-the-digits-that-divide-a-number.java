class Solution {
    public int countDigits(int num) {
        int val = num;
        int count=0;
        int i=0;
        while(val>0){
            int divNum = val%10;
            val /= 10;
            if(num%divNum == 0){
                count++;
            }
        }
        return count;
    }
}