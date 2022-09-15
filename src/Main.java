public class Main {
    static class  Node {
        public int value;
        public Node next;

        public Node(int value) {
            this.value = value;
        }
    }
    static class LinkedList {
        public Node head;

        public void add(int value) {
            Node newNode = new Node(value);
            head = newNode;

        }
    }

    public static void main(String[] args) {
        LinkedList ll= new LinkedList();
        System.out.println("Head"+ll.head);
        ll.add(0);
        System.out.println("Head: value="+ll.head.value+",+ll.Head.next");

    }

    }




