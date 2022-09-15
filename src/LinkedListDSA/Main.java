package LinkedListDSA;

public class Main {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        System.out.println("Head :" + ll);

        ll.addBegin(0);
        ll.addBegin(1);
        ll.addBegin(2);
        ll.display();

        ll.addEnd(3);
        ll.addEnd(4);
        ll.display();
        ll.delBegin(1);
        ll.display();
    }
}