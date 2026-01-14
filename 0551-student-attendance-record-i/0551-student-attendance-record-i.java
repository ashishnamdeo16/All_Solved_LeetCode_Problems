class Solution {
    public boolean checkRecord(String s) {
        int absentCount = 0;
        int LateCount = 0;
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch == 'A'){
                absentCount++;
                LateCount = 0;
            }else if(ch == 'L'){
                LateCount++;
                if (LateCount >= 3) return false;
            }else{
                LateCount=0;
            }
        }
        if(absentCount < 2){
            return true;
        }else {
            return false;
        }
    }
}