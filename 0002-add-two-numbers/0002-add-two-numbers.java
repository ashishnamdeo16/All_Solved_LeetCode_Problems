class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode curr = l1;
        ListNode curr2 = l2;
        ListNode temp = new ListNode(0);
        ListNode dummy = temp;
        int carry = 0;

        while(curr != null && curr2 != null){
            int sum = curr.val + curr2.val + carry;
            carry = sum/10;
            dummy.next = new ListNode(sum%10);
            dummy = dummy.next;
            curr = curr.next;
            curr2 = curr2.next;
        }

        while(curr != null){
            int sum = curr.val + carry;
            carry = sum/10;
            dummy.next = new ListNode(sum%10);
            dummy = dummy.next;
            curr = curr.next;
        }

        while(curr2 != null){
            int sum = curr2.val + carry;
            carry = sum/10;
            dummy.next = new ListNode(sum%10);
            dummy = dummy.next;
            curr2 = curr2.next;
        }

        if(carry != 0){
            dummy.next = new ListNode(carry);
        }
       
       return temp.next;
    }
}