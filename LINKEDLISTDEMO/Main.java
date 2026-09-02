package LINKEDLISTDEMO;

public class Main {
    public static void main(String[] args) {
        Node ten = new Node(10);
        Node twenty = new Node(20);
        Node thirty = new Node(30);
        Node fourty = new Node(40);
        Node fifty = new Node(50);

        Node head = ten;
        ten.setNext(twenty);
        twenty.setNext(thirty);
        thirty.setNext(fourty);
        fourty.setNext(fifty);
        fifty.setNext(null);
        printLinkedList(head);
    }

    public static void printLinkedList(Node head) {
        Node curr = head;
        while (curr.getNext() != null) {
            System.out.println(curr.getdata());
            curr = curr.getNext();
        }

    }
}
