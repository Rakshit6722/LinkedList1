package LinkedList1;

public class LL {
    private Node head;
    private Node tail;

    private int size;

    
    public LL() { // initialize size everytime a linked list is created
        this.size = 0;
    }
    public void insertFirst(int val){
        Node node = new Node(val); //create a new node
        node.next = head; //point node.next -> current head
        head = node;//make node new head

        if(tail==null){//if there is not tail then tail and head will be pointing to same node
            tail = head;
        }

        size++;//incrementing the size as new node are added to the LL
    }
    

    private class Node {
        private int value;
        private Node next;

        // 'this' keyword is used to access and manipulate instance variables and to call
        // constructors of the current instance (object) of a class.

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }
}