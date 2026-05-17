class Solution {
    public ListNode swapPairs(ListNode head) {
        if(head == null) return head;
        ListNode left = head;
        ListNode right = head;
        ListNode res = null;
        ListNode prevLeft = null;
        int size = 2;

        while(true){
            right = left;
            for(int i=0;i<size-1;i++){
                if(right == null){
                    break;
                }
                right = right.next;
            }
            if(right != null){
                ListNode nextLeft = right.next;
                reverse(left,size);
                if(res == null){
                    res = right;
                }
                if(prevLeft != null){
                    prevLeft.next = right;
                }
                prevLeft = left;
                left = nextLeft;
            }else{
                if(prevLeft != null){
                    prevLeft.next = left; 
                }
                if(res == null){
                    res = left;
                }
                break;
            }
        }

        return res;
    }
    public void reverse(ListNode head,int size){
        ListNode curr = head;
        ListNode temp = null;
        for(int i=0;i<size;i++){
            ListNode helper = curr.next;
            curr.next = temp;
            temp = curr;
            curr = helper;
        }
    }
}

// // 1 2 3 4
// curr = 1 -> 2
// helper = 2 
// temp = null
// curr = 1 -> null
// temp = 1 -> null
// curr = 2 -> 3
