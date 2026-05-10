class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(head == null || left == right) return head;
        ListNode prev = null;
        ListNode curr = head;

        for(int i=1;i<left;i++){
            prev = curr;
            curr = curr.next;
        }

        ListNode temp = null;
        ListNode connection = prev; 
        ListNode tail = curr;

        for(int i=left;i<=right;i++){
            ListNode helper = curr.next;
            curr.next = temp;
            temp = curr;
            curr = helper;
        }

        if(connection != null){
             connection.next = temp;
        }else{
            head = temp;
        }
        
        tail.next = curr;
        
        return head;
    }
}