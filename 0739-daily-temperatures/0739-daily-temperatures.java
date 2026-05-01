class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        Deque<Integer> stack = new ArrayDeque<>();
        int[] arr = new int[n];

        stack.push(n-1);
        arr[n-1] = 0;

        for(int i = n-2;i>=0;i--){
            while(!stack.isEmpty() && temperatures[i] >= temperatures[stack.peek()]){
                stack.pop();
            }

            if(stack.isEmpty()){
                arr[i] = 0;
            }else{
                arr[i] = stack.peek() - i;
            }

            stack.push(i);
        }

        return arr;
    }
}