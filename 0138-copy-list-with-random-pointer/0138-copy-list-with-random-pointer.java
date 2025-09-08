/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        if(head == null) return null;

        Map<Node,Node> map = new HashMap<>();
    
        Node newListHead = new Node(head.val);
        map.put(head,newListHead);
        Node oldTemp = head.next;
        Node newTemp = newListHead;

        while(oldTemp != null){
            Node copyNode = new Node(oldTemp.val);
            map.put(oldTemp,copyNode);
            newTemp.next = copyNode;
            oldTemp = oldTemp.next;
            newTemp = newTemp.next;
        }

        oldTemp = head; newTemp= newListHead;

        while(oldTemp != null){
            newTemp.random = map.get(oldTemp.random);
            oldTemp = oldTemp.next;
            newTemp = newTemp.next;
        }

        return newListHead;
    }
}