class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(head == null || left == right) return head;
        ListNode startNode = null;
        ListNode endNode = null;
        ListNode rightNode = null;
        ListNode leftNode = null;
        ListNode curr = head;
        int count = 1;
        
        while(curr != null){
            if(left - 1 == count){
                startNode = curr;
            }
            if (count == left) {
                leftNode = curr;
            } 
            if(right == count){
                rightNode = curr;
                endNode = curr.next;
                break;
            }
            curr = curr.next;
            count++;
        }

        rightNode.next = null;

        ListNode curr2 = leftNode;
        ListNode temp = null;
        while(curr2 != null){
            ListNode ref = curr2.next;
               curr2.next = temp;
               temp = curr2;
               curr2 = ref;
        }

        if (startNode != null) {
            startNode.next = temp;
        } else {
            head = temp;
        }

        leftNode.next = endNode;

        return head;
    }
}