class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode left = head;
        ListNode right = head;
        ListNode prevleft = null;
        ListNode res = null;
        while(true){
            right = left;
            for(int i=0;i<k-1;i++){
                if(right == null){
                    break;
                }
                right = right.next;
            }
            if(right != null){
                ListNode next = right.next;
                reverse(left,k);
                if(prevleft != null){
                    prevleft.next = right;
                }
                if(res == null){
                    res = right;
                }
                prevleft = left;
                left = next;
            }else{
                if(prevleft != null){
                    prevleft.next = left;
                }
                if(res == null){
                    res = left;
                }
                break;
            }
        }
        return res;
    }
    public void reverse(ListNode left,int size){
        ListNode curr = left;
        ListNode temp = null;
        for(int i=0;i<size;i++){
            ListNode ref = curr.next;
            curr.next = temp;
            temp = curr;
            curr = ref;
        }
    }
}