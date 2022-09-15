package SingleLinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList ll=new LinkedList();
        System.out.println("head :"  + ll.head);
        ll.addBegin(1);
        ll.addBegin(2);
        ll.display();
        ll.addEnd(3);
        ll.addEnd(4);
        ll.display();
    }
}

