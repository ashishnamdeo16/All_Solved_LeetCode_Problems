/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
       int len = 0;
       ListNode curr2 = head;
       while(curr2 != null){
         len++;
         curr2 = curr2.next;
       }

        ListNode curr = head;
        ListNode temp = curr.next;
        if(len == n ){
            return head.next;
        }
       for(int i=1;i<len;i++){
        if(i== len-n){
            curr.next = temp.next;
        }
        curr = curr.next;
        temp = temp.next;
       }
 
       return head;
    }
}