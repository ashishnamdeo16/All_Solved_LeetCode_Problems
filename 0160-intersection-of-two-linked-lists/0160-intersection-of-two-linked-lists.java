public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
       ListNode curr = headA;
       ListNode curr2 = headB;
       int len = 0;
       int len2 = 0;
       while(curr != null){
        curr = curr.next;
        len++;
       }
        while(curr2 != null){
        curr2 = curr2.next;
        len2++;
       }

       int finalstart = Math.abs(len - len2);

       curr = headA;
       curr2 = headB;

      if(len > len2){
         while(finalstart > 0){
            curr = curr.next;
            finalstart--;
         }
       }else{
         while(finalstart > 0){
            curr2 = curr2.next;
            finalstart--;
         }
       }

       while(curr != null && curr2 != null){
     
        if(curr == curr2){
            return curr;
        }
        curr = curr.next;
        curr2 = curr2.next;
       }

     return null;
    }
}