class Solution {
    public ListNode swapPairs(ListNode head) {
        if(head == null) return head;
        ListNode left = head;
        ListNode right = head;
        ListNode prevLeft = null;
        ListNode res = null;
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
                reverse(left,2);
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

        // if(head != null && head.next == null) return head;
        // ListNode curr = head;
        // ListNode prev = null;
        // head = head.next; 

        // while(curr != null && curr.next != null){
        //     ListNode temp = curr;
        //     ListNode ref = curr.next;
        //     ListNode ref2 = curr.next.next;
        //     curr = curr.next.next;
        //     ref.next = temp;
        //     temp.next = ref2;

        //     if(prev != null){
        //         prev.next = ref;
        //     }

        //     prev = temp;
        //     curr = ref2;
        // }
        
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