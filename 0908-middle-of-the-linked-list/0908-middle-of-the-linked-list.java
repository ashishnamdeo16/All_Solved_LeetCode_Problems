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
    public ListNode middleNode(ListNode head) {

        ListNode slow = head;
        ListNode fast = head;

        while(fast !=null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;

        //Brute Force
        // if(head == null || head.next == null) return head;
        // int len =0;
        // ListNode curr = head;
        // while(curr != null){
        //     len++;
        //     curr = curr.next;
        // }
        // curr = head;
        // ListNode middle = null;
        // if(len%2 != 0 ){
        //     int nodeIndex = len/2 + 1;
        //     for(int i=1;i<nodeIndex;i++){
        //         curr = curr.next;
        //     }
        //     middle = curr;
        // }else{
        //     int nodeIndex = len/2 + 1;
        //     for(int i=1;i<nodeIndex;i++){
        //         curr = curr.next;
        //     }
        //     middle = curr;
        // }
        // return middle;

    }
}