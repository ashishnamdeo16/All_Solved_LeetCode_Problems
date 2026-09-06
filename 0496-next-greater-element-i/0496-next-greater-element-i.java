class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> stack = new Stack<>();
        int[] arr = new int[nums2.length];
        int[] farr = new int[nums1.length];

        arr[nums2.length - 1] = -1;
        stack.push(arr[nums2.length - 1]);

        for(int i = nums2.length - 2 ;i >= 0;i--){

            while(!stack.isEmpty() && stack.peek() <= arr[i]){
                stack.pop();
            }

            if(stack.isEmpty()){
                arr[i] = -1;
            }else{
                arr[i] = stack.peek();
            }

            stack.push(nums2[i]);
        }

        for(int i =0;i< nums1.length;i++){
            for(int j =0;j<nums2.length;j++){
                if(nums1[i] == nums2[j]){
                    farr[i] = arr[j];
                    break;
                }
            }
        }


        return farr;



    }
}

//We can optimize it by using hashMap