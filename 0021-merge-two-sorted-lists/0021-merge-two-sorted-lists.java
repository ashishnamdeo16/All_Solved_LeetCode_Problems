class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
       ListNode temp = new ListNode();
       ListNode curr = temp;
       ListNode p1 = list1;
       ListNode p2 = list2;

        while(p1 != null && p2 != null){
            if(p1.val > p2.val){
                curr.next = p2;
                p2 = p2.next;
                curr = curr.next;
            }else{
                curr.next = p1;
                p1 = p1.next;
                curr = curr.next;
            }
        }

        while(p1 != null){
            curr.next = p1;
                p1 = p1.next;
                curr = curr.next;
        }

         while(p2 != null){
            curr.next = p2;
            curr = curr.next;
            p2 = p2.next;
        }

        return temp.next;
    }
}