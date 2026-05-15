class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(head == null || right == left) return head;

        int count = 1;
        ListNode curr = head;
        ListNode before = null;

        while(count < left){
            before = curr;
            curr = curr.next;
            count++;
        }

        ListNode temp = null;
        ListNode tail = curr;

        while(count <= right){
            ListNode helper = curr.next;
            curr.next = temp;
            temp = curr;
            curr = helper;
            count++;
        }


        if(before != null){
             before.next = temp;
        }else{
            head = temp;
        }

        tail.next = curr;
       
        return head;
    }
}