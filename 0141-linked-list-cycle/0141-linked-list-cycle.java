public class Solution {
    public boolean hasCycle(ListNode head) {
        boolean isCycle = false;
        ListNode slow = head;
        ListNode fast = head;
    
        while(fast != null && fast.next != null){
            if(slow == fast){
                isCycle = true;
                break;
            }
            slow = slow.next;
            fast = fast.next.next;
            
        }

        return isCycle;
    }
}