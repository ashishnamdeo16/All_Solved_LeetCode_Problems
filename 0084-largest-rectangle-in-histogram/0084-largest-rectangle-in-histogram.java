class Solution {
    public int largestRectangleArea(int[] heights) {
       return maxArea(allAreas(heights,width(NearestSmallerToLeft(heights),NearestSmallerToRight(heights))));
    }

    public int[] NearestSmallerToLeft(int[] heights){
        int[] arr = new int[heights.length];
        Stack<int[]> stack = new Stack<>();
        
        stack.push(new int[]{heights[0],0});
        arr[0] = -1;

        for(int i=1;i<heights.length;i++){
            while(!stack.isEmpty() && heights[i] <= stack.peek()[0]){
                stack.pop();
            }

            if(stack.isEmpty()){
                arr[i] = -1;
            }else{
                arr[i] = stack.peek()[1];
            }

            stack.push(new int[]{heights[i], i});
        }

        return arr;
    }

    public int[] NearestSmallerToRight(int[] heights){
        int[] arr = new int[heights.length];
        Stack<int[]> stack = new Stack<>();
        arr[heights.length - 1] = heights.length;

        stack.push(new int[]{heights[heights.length - 1],heights.length-1});

        for(int i=heights.length - 2;i>=0;i--){
            while(!stack.isEmpty() && heights[i] <= stack.peek()[0]){
                stack.pop();
            }

            if(stack.isEmpty()){
                arr[i] = heights.length;
            }else{
                arr[i] = stack.peek()[1];
            }

            stack.push(new int[]{heights[i], i});
        }

        return arr;    
    }


    public int[] width(int[] left,int[] right){
        int[] width = new int[left.length];
        for(int i=0;i<width.length;i++){
            width[i] = right[i] - left[i] - 1;
        }
        return width;
    }

    private int[] allAreas(int[] arr, int[] width){
        int[] areas = new int[arr.length];
        for(int i=0;i<arr.length;i++){
            areas[i] = arr[i] * width[i];
        }
        return areas;
    }


    public int maxArea(int[] arr){
        int max = 0;
        for(int i : arr){
            max = Math.max(i,max);
        }
        return max;
    }
}