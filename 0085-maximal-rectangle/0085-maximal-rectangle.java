class Solution {
    public int maximalRectangle(char[][] matrix) {
       int[] arr = new int[matrix[0].length];
       int max = 0;
       for(int i=0;i<matrix.length;i++){
        for(int j=0;j<matrix[0].length;j++){
            if(matrix[i][j] == '0'){
                arr[j] = 0;
            }else{
                 arr[j] = arr[j] + Character.getNumericValue(matrix[i][j]);
            }
        }
        max = Math.max(max,MAH(arr));
       }
       return max;
    }

    public int MAH(int[] arr){
        return maxArea(allAreas(arr,width(NSL(arr),NSR(arr))));
    }

    public int[] NSL(int[] arr){
        int[] ans = new int[arr.length];
        Stack<int[]> stack = new Stack<>();

        stack.push(new int[]{arr[0],0});
        ans[0] = -1;

        for(int i=0;i<arr.length;i++){
            while(!stack.isEmpty() && arr[i] <= stack.peek()[0]){
                stack.pop();
            }

            if(stack.isEmpty()){
                ans[i] = -1;
            }else{
                ans[i] = stack.peek()[1];
            }

            stack.push(new int[]{arr[i],i});
        }  

        return ans;
    }

    public int[] NSR(int[] arr){
        int[] ans = new int[arr.length];
        Stack<int[]> stack = new Stack<>();

        stack.push(new int[]{arr[arr.length - 1],arr.length - 1});
        ans[arr.length - 1] = arr.length;

        for(int i=arr.length-2;i>=0;i--){
            while(!stack.isEmpty() && arr[i] <= stack.peek()[0]){
                stack.pop();
            }

            if(stack.isEmpty()){
                ans[i] = arr.length;
            }else{
                ans[i] = stack.peek()[1];
            }

            stack.push(new int[]{arr[i],i});
        }  

        return ans;
    }

    public int[] width(int[] left,int[] right){
        int[] ans = new int[left.length];

        for(int i=0;i<ans.length;i++){
            ans[i] = right[i] - left[i] - 1;
        }

        return ans;
    }

    public int[] allAreas(int[] arr,int[] arr2){
        int[] ans = new int[arr.length];

        for(int i=0;i<arr.length;i++){
            ans[i] = arr[i] * arr2[i];
        }

        return ans;
    }

    public int maxArea(int[] arr){
        int max = 0;
        for(int i=0;i<arr.length;i++){
            max = Math.max(arr[i],max);
        }
        return max;
    }


}