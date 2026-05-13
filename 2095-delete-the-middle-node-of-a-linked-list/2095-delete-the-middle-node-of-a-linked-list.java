class Solution {
    public ListNode deleteMiddle(ListNode head) {
       if(head == null || head.next == null) return null; 
       ListNode slow = head;
       ListNode fast = head;

       while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
       }

       ListNode curr = head;

       while(curr.next != slow){
        curr = curr.next;
       }

       ListNode temp = slow.next;
       curr.next = temp;

       return head;
    }
}