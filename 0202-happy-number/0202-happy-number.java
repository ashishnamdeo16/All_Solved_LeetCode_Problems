class Solution {
    public boolean isHappy(int n) {
        int slow = n;
        int fast = n;
        while(fast != 1){
            slow = findSq(slow);
            fast = findSq(fast);
            fast = findSq(fast);
            if(slow == fast && slow != 1){
                return false;
            }
        }
        return true;
    }

    public int findSq(int n){
        int sum = 0;
        while(n>0){
            int rem = n%10;
            n = n/10;
            sum = sum + rem * rem;
        }
        return sum;
    }
}