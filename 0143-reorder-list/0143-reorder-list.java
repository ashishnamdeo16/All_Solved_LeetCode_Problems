class Solution {
    public void reorderList(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode left = head;
        ListNode right = reverse(slow);

        while(left != null && right != null){
        ListNode temp = left.next;
        ListNode temp2 = right.next;
            left.next = right;
            right.next = temp;
            left = temp;
            right = temp2;
        }

    }

    public ListNode reverse(ListNode slow){
        if(slow == null) return slow;
        ListNode temp = null;
        ListNode curr = slow;
        while(curr != null){
            ListNode helper = curr.next;
            curr.next = temp;
            temp = curr;
            curr = helper;
        }
        return temp;
    }
}

//Take pointer to center using Slow and Fast
//Reverse the another Half
//Start connecting both the lists
