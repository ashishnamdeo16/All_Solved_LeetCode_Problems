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
    public ListNode deleteNodes(ListNode head, int m, int n) {
        ListNode left = head;
        ListNode right = head;
        while(true){
            right = left;
            for(int i=0;i<m-1;i++){
                if(right == null){
                    break;
                }
                right = right.next;
            }

            if(right == null) break;

            left = right.next;
            
            int count = n;
            while(count > 0){
                if(left == null){
                    break;
                }
                left = left.next;
                count--;
            }

            right.next = left;
        }
        return head;
    }
}