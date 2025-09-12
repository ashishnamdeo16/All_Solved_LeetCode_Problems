class Solution {
    public int largestRectangleArea(int[] heights) {
        return maxArea(allAreas(heights,width(NearestSmallestLeft(heights),NearestSmallestRight(heights))));
    }

    private static int[] NearestSmallestRight(int[] arr){
        ArrayList<Integer> list = new ArrayList<>();
        Stack<Pair> stack = new Stack<>();
        for(int i=arr.length-1;i>=0;i--){
            if(stack.isEmpty()){
                list.add(arr.length);
            }else if(!stack.isEmpty() && arr[i] > stack.peek().num1){
                list.add(stack.peek().num2);
            }else if(!stack.isEmpty() && arr[i] <= stack.peek().num1){
                while(!stack.isEmpty() && arr[i] <= stack.peek().num1){
                    stack.pop();
                }
                if(stack.isEmpty()){
                  list.add(arr.length);
                }else{
                    list.add(stack.peek().num2);
                }
            }
            stack.push(new Pair(arr[i],i));
        }
        Collections.reverse(list);

        int[] right = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            right[i] = list.get(i);
        }
        return right;
    }

    private static int[] NearestSmallestLeft(int[] arr){
        ArrayList<Integer> list = new ArrayList<>();
        Stack<Pair> stack = new Stack<>();
        for(int i=0;i<arr.length;i++){
            if(stack.isEmpty()){
                list.add(-1);
            }else if(!stack.isEmpty() && arr[i] > stack.peek().num1){
                list.add(stack.peek().num2);
            }else if(!stack.isEmpty() && arr[i] <= stack.peek().num1){
                while(!stack.isEmpty() && arr[i] <= stack.peek().num1){
                    stack.pop();
                }
                if(stack.isEmpty()){
                  list.add(-1);
                }else{
                    list.add(stack.peek().num2);
                }
            }
            stack.push(new Pair(arr[i],i));
        }


        int[] left = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            left[i] = list.get(i);
        }
        return left;
    }

    private static int[] width(int[] left,int[] right){
        int[] width = new int[left.length]; 
        for(int i=0;i<width.length;i++){
            width[i] = right[i] - left[i] - 1;
        }
        return width;
    }

    private static int[] allAreas(int[] arr, int[] width){
        int[] areas = new int[arr.length];
        for(int i=0;i<arr.length;i++){
            areas[i] = arr[i] * width[i];
        }
        return areas;
    }

    private static int maxArea(int[] arr){
        int max =0;
        for(int i:arr){
            max = Math.max(i,max);
        }
        return max;
    }

    public static class Pair{
        int num1;
        int num2;
        public Pair(int num1,int num2){
            this.num1 = num1;
            this.num2 = num2;
        }     
    }
}