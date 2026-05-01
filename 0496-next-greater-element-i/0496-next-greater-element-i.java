class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> stack = new Stack<>();
        int n = nums2.length;
        int[] arr = new int[n];
        int[] arr2 = new int[nums1.length];
        stack.push(nums2[n - 1]);
        arr[n-1] = -1;
        for(int i=nums2.length - 2;i>=0;i--){
            while(!stack.isEmpty() && nums2[i] >= stack.peek()){
                stack.pop();
            }

            if(stack.isEmpty()){
                arr[i] = -1;
            }else{
                arr[i] = stack.peek();
            }

            stack.push(nums2[i]);
        }

        for(int i=0;i<nums1.length;i++){
            for(int j=0;i<nums2.length;j++){
                if(nums1[i] == nums2[j]){
                    arr2[i] = arr[j];
                    break;
                }
            }
        }

        return arr2;
    }
}