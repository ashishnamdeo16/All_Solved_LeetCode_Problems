class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null || k==0) return head;
        int len = 0;
        ListNode curr = head;
        while(curr != null){
            curr = curr.next;
            len++;
        }

        k = k % len;
        if(k == 0) return head;
        
        ListNode left = head;
        ListNode right = head;
        ListNode res = null;

        while(k>0){
            right = left;
            while(right != null && right.next != null && right.next.next != null){
                right = right.next;
            }
            ListNode temp = right.next;
            right.next = null;
            if(temp != null){
                temp.next = left;
            }
            left = temp;
            res = temp;
            k--;
        }
        return res;
    }
}