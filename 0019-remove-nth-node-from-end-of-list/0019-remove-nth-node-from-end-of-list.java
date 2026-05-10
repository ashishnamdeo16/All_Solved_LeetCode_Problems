class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
      if(head == null || head.next == null) return null;  
      ListNode curr = head;
      int count = 0;

      while(curr != null){
        curr = curr.next;
        count++;
      }  

       ListNode prev = null;
       curr = head;

      for(int i=1;i<=count-n;i++){
        prev = curr;
        curr = curr.next;
      }

      if(prev != null){
        prev.next = curr.next;
      }

      return head;
    }
}