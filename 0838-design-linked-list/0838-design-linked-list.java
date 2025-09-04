class MyLinkedList {

    private Node tail;
    private Node head;
    private int size;

    public MyLinkedList() {
       this.size = 0;
       this.head = null;
       this.tail = null;
    }
    
    public int get(int index) {
        Node curr = head;
        if (index < 0 || index >= size) {
        return -1; 
        }
        for(int i=0;i<index;i++){
            curr = curr.next; 
        }
        return curr.val;
    }
    
    public void addAtHead(int val) {
        Node newNode = new Node(val);
        if(head == null){
            head = tail = newNode;
        }else{
             newNode.next = head;
             head = newNode;
        }
        size++;
    }
    
    public void addAtTail(int val) {
         Node newNode = new Node(val);
         if(tail == null){
             head = tail = newNode;
         }else{
            tail.next = newNode;
            tail = newNode;
         }
         size++;
    }
    
    public void addAtIndex(int index, int val) {
        if (index < 0 || index > size) {
         return ;
         }
        if(index == 0) {
            addAtHead(val);
            return;    
        }
        if(index == size) {
            addAtTail(val);
            return;
        }

        Node newNode = new Node(val);
        Node curr = head;

        for(int i=0;i<index-1;i++){
            curr = curr.next;
        }

        Node temp = curr.next;
        curr.next = newNode;
        newNode.next = temp;
        size++;
    }
    
    public void deleteAtIndex(int index) {
        if (index < 0 || index >= size) {
        return ; 
        }

        if (index == 0) { // delete head
        head = head.next;
        if (head == null) tail = null; // list becomes empty
        size--;
        return;
        }
  
        Node curr = head;
        for(int i=0;i<index-1;i++){
              curr = curr.next;
        }
        Node toDelete = curr.next;         
        curr.next = toDelete.next;        
        
        if (toDelete == tail) {
                tail = curr;
            }
        size--;
    }

    private class Node{
    int val;
    Node next;

    public Node(int val){
        this.val = val;
    }
    }
}



/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */