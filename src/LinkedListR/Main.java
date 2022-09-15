package LinkedListR;

public class Main {
    public static void main(String[] args) {
        LinkedList ll= new LinkedList();
        System.out.println("Head: " +ll.Head);

        ll.addBegin(12);
        ll.addBegin(13);
        ll.addBegin(14);
        ll.addBegin(16);
        ll.addBegin(15);
        ll.display();
        ll.addEnd(3);
        ll.display();
        ll.delBegin();
        ll.display();
        ll.delEnd();
        ll.display();
        ll.delAtPosition(2);
          ll.display();
          ll.reverseList();
          ll.display();
          ll.delAtMiddle();
          ll.display();
    }
}
