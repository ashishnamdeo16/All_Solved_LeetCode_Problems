class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
      ListNode curr = head;
      int count = 0;

      while(curr != null){
        curr = curr.next;
        count++;
      }  

       ListNode curr2 = head;
       ListNode temp = curr2.next;

       if(count == n) return head.next;

      for(int i=1;i<count;i++){
        if(i == count-n) {
            curr2.next = temp.next;
            return head;
        }
        curr2 = curr2.next;
        temp = temp.next;
      }

      return head;
    }
}