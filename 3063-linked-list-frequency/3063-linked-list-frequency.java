class Solution {
    public ListNode frequenciesOfElements(ListNode head) {
        HashMap<Integer,Integer> map = new HashMap<>();
        ListNode res = new ListNode(0);
        ListNode dummy = res;
        ListNode curr = head;
        while(curr != null){
            map.put(curr.val,map.getOrDefault(curr.val,0)+1);
            curr = curr.next;
        }
        System.out.print(map);
        for(int x : map.values()){
            res.next = new ListNode(x);
            res = res.next;
        }
        return dummy.next;
    }
}