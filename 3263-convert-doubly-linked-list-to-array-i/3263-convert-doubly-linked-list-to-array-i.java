/*
// Definition for a Node.
class Node {
    public int val;
    public Node prev;
    public Node next;
};
*/

class Solution {
    public int[] toArray(Node head) {
        Node curr = head;
        ArrayList<Integer> arr = new ArrayList<>();
        while(curr != null){
            arr.add(curr.val);
            curr = curr.next;
        }
        int[] arr2 = new int[arr.size()];
        for(int i=0;i<arr.size();i++){
            arr2[i] = arr.get(i); 
        }
        return arr2;
    }
}