class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();
        for(int x : asteroids){
            if(!stack.isEmpty()){
                if(stack.peek() > 0 && x < 0){
                    while(!stack.isEmpty() && stack.peek() > 0 && stack.peek() < Math.abs(x) ){
                        stack.pop();
                    }
                    if(stack.isEmpty()){
                        stack.push(x);
                    }else if(stack.peek() < 0){
                        stack.push(x);
                    }else if(stack.peek() == Math.abs(x)){
                       stack.pop();
                    }
                }else{
                    stack.push(x);
                }
            }else{
                stack.push(x);
            }
        }


        int[] arr = new int[stack.size()];
        for(int i = stack.size() - 1;i>=0;i--){
            arr[i] = stack.pop();
        }

        return arr;
    }
}