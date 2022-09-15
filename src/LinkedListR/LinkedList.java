package LinkedListR;

public class LinkedList {
    public Node Head;

        public void addBegin(int value){
            Node newNode=new Node(value); // create a new Node
            newNode.next= Head;
             Head= newNode;

        }
        public void addEnd(int value) {
            Node newNode = new Node(value);
            if (Head == null) {
                Head = newNode;
            } else {
                Node curr = Head;
                while (curr.next != null) {
                    curr = curr.next;
                }
                curr.next = newNode;
            }
        }
        public void delBegin(){
        if(Head!= null){
            Head=Head.next;
        }
        }

        public void delEnd(){
           if(Head==null){
               System.out.println("Linked list not present");
           }
            else{
                Node curr=Head;
                while(curr.next.next!=null){
                    curr=curr.next;
                }
                curr.next=null;
            }
        }

    public void delAtPosition(int Position){
        if(Head==null) {
            System.out.println("empty list");
        }
        else{
            int count=1;

            Node prev= Head;
            while(count<Position-1) {
                prev = prev.next;
                count++;
            }
            Node curr=prev.next;
            prev.next=curr.next;
            curr.next= null;
        }
    }
     public void reverseList(){

            if(Head==null){
                System.out.println("Linked List is empty");
            }
            else{
            Node curr=Head;
            Node prev=null;

            while(curr!=null) {
               Node Next = curr.next;
                curr.next = prev;
                prev = curr;
                curr = Next;
            }
            Head=prev;
            }
     }
     public void delAtMiddle(){
            if (Head==null){
                System.out.println("empty linked list");
            }
            Node slowPtr=Head;
            Node fastPtr=Head;
            Node prev=null;
            while(fastPtr!=null && fastPtr.next!=null){
                fastPtr= fastPtr.next.next;
                prev=slowPtr;
                slowPtr= slowPtr.next;
            }
            prev.next=slowPtr.next;

     }




        public void display(){ // Method to display all the Linked List
        Node curr= Head;       // create a new node which points to head
        while(curr!=null){     // Move through the Linked list till end point to null
            System.out.print(curr.value +" "); // print the values till null
            curr=curr.next; // current pointer moving to next
        }
            System.out.println();
        }
    }

