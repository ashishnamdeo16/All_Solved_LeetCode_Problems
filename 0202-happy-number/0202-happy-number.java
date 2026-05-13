class Solution {
    public boolean isHappy(int n) {
        int slow = n;
        int fast = n;
        while(fast != 1){
            slow = func(slow);
            fast = func(fast);
            fast = func(fast);
            if(slow == fast && slow != 1){
                return false;
            }
        }

        return true;
    }

    public int func(int n){
        int sum = 0;
        while(n > 0){
            int rem = n % 10;
            sum += rem * rem;
            n /= 10;
        }
        return sum;
    }
}