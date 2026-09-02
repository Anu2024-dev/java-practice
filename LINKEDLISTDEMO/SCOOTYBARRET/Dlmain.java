package LINKEDLISTDEMO.SCOOTYBARRET;

public class Dlmain {
    public static void main(String[] args) {
        DoublyLinkedList myDll = new DoublyLinkedList(7);
        // myDll.getHead();
        // myDll.getTail();
        // myDll.getlength();
        // myDll.printList();
        // myDll.append(8);
        // myDll.printList();
        // System.out.println(myDll.removeLast().value);
        myDll.prepend(5);
        // myDll.printList();
        // System.out.println(myDll.removeFirst().value);
        // System.out.println("index" + myDll.get(0).value);
        // myDll.set(0, 11);
        myDll.insert(1, 6);
        myDll.printList();
        myDll.remove(0);
        myDll.printList();

    }
}
