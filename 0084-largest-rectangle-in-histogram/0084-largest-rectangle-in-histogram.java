class Solution {

    public int largestRectangleArea(int[] heights) {
        return maxArea(allAreas(heights,width(NSL(heights),NSR(heights))));
    }

    public int[] NSL(int[] heights){
        int[] ans = new int[heights.length];
        Stack<int[]> stack = new Stack<>();

        stack.push(new int[]{heights[0],-1});
        ans[0] = -1;

        for(int i=0;i<heights.length;i++){
            while(!stack.isEmpty() && heights[i] <= stack.peek()[0]){
                stack.pop();
            }

            if(stack.isEmpty()){
                  ans[i] = -1;
            }else{
                  ans[i] = stack.peek()[1];
            }
             stack.push(new int[]{heights[i],i});
        }
        return ans;
    }

    public int[] NSR(int[] heights){
        int[] ans = new int[heights.length];
        Stack<int[]> stack = new Stack<>();

        stack.push(new int[]{heights[heights.length - 1],-1});
        ans[heights.length - 1] = heights.length;

        for(int i=heights.length - 2;i>=0;i--){
            while(!stack.isEmpty() && heights[i] <= stack.peek()[0]){
                stack.pop();
            }

            if(stack.isEmpty()){
                  ans[i] = heights.length;
            }else{
                  ans[i] = stack.peek()[1];
            }
             stack.push(new int[]{heights[i],i});
        }        
    return ans;
    }

    public int[] width(int[] left,int[] right){
        int[] width = new int[left.length];
        for(int i=0;i<left.length;i++){
            width[i] = right[i] - left[i] - 1;
        }
        return width;
    }


    public int[] allAreas(int[] heights,int[] width){
        int[] allArea = new int[heights.length];
        for(int i=0;i<heights.length-1;i++){
            allArea[i] = heights[i] * width[i];
        }
        return allArea;
    }

    public int maxArea(int[] arr){
        int area = 0;
        for(int x : arr){
            area = Math.max(x,area);
        }
        return area;
    }

}