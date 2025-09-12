class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
     int[] arr = new int[nums1.length];   
     Stack<Integer> stack = new Stack<>();  
     for(int i=0;i<nums1.length;i++){
        for(int j=0;j<nums2.length;j++){
            if(nums1[i] == nums2[j]){  
                for(int k=nums2.length-1;k>=j;k--){
                    stack.push(nums2[k]);
                }
                if(stack.isEmpty()){
                    arr[i] = -1;
                }else if(!stack.isEmpty() && stack.peek() > nums2[j]){
                    arr[i] = stack.peek();
                }else if(!stack.isEmpty() && stack.peek() <= nums2[j]){
                    while(!stack.isEmpty() && stack.peek() <= nums2[j]){
                        stack.pop();
                    }
                    if(stack.isEmpty()){
                        arr[i] = -1;
                    }else{
                        arr[i] = stack.peek();
                    }
            }
        }
        stack.clear();
     }  
     } 
     return arr;
    }
}