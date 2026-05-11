class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<ListNode> pq = new PriorityQueue<>((a,b) -> a.val - b.val);
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;

        for(int i=0;i<lists.length;i++){
            if(lists[i] != null){
                pq.offer(lists[i]);
            }
        }

        while(!pq.isEmpty()){
            ListNode p = pq.poll();
            int val = p.val;
            ListNode next = p.next;
            if(next != null){
                pq.offer(next);
            }
            curr.next = new ListNode(val);
            curr = curr.next;
        }

        return dummy.next;
    }
}