package LinkedListDSA;

public class LinkedList {
    private Node head;

      // function for adding a node
    public void add(int value) {
        // create a new node
        Node newNode= new Node(value);
        //head should point to new node
        head = newNode;

    }

    public void addBegin(int value) {

        Node newNode = new Node(value);  // create a new node
        newNode.next = head; //point next field of new node to current head

        head = newNode;   //point head to new node
    }

    public void addEnd(int value){
        Node newNode=new Node(value);
        if(head==null){
            head=newNode;
        }
        else {
            Node curr= head;
            while(curr.next!=null){
                curr=curr.next;
            }
            curr.next= newNode;
        }
    }

    public void delBegin(int value){
         if (head!=null){
            head= head.next;
        }
    }


    public void display() {
        System.out.print("LinkedList ");

        Node curr = head;
        while (curr != null) {
            System.out.print(curr.value + " ");
            curr = curr.next;
        }
        System.out.println();
    }
}

