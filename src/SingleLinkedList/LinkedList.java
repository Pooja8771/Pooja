package SingleLinkedList;

public class LinkedList {
    public Node head;

    public void add(int value) {
        Node newNode = new Node(value);
        head = newNode;
    }

public void addBegin(int value){
        Node newNode=new Node(value);
        newNode.next= head;
        head=newNode;
}
 public void addEnd(int value){
        Node newNode=new Node(value);
        if(head==null){
            head= newNode;

     }
       Node currNode= head;
        while(currNode.next!=null){
            currNode=currNode.next;
        }
        currNode.next= newNode;
 }


 public void display(){
     System.out.println("LinkList");

     Node currNode= head;
     while(currNode!=null){
         System.out.println(currNode.value +"");
         currNode=currNode.next;
     }
     System.out.println();
 }
}