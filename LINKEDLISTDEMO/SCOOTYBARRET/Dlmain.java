package LINKEDLISTDEMO.SCOOTYBARRET;

public class Dlmain {
    public static void main(String[] args) {
        //DoublyLinkedList myDll = new DoublyLinkedList(7);
        // myDll.getHead();
        // myDll.getTail();
        // myDll.getlength();
        // myDll.printList();
        // myDll.append(8);
        // myDll.printList();
        // System.out.println(myDll.removeLast().value);
        // myDll.prepend(5);
        // // myDll.printList();
        // // System.out.println(myDll.removeFirst().value);
        // // System.out.println("index" + myDll.get(0).value);
        // // myDll.set(0, 11);
        // myDll.insert(1, 6);
        // myDll.printList();
        // myDll.remove(0);
        // myDll.printList();
        DoublyLinkedList myList = new DoublyLinkedList(1);
        myList.append(2);
        myList.append(3);
        myList.append(4);
        myList.append(1);
        System.out.print("List: ");
        myList.printList();
        System.out.println("Expected: false");
        System.out.println("Actual: " + myList.PalindromeChecker());
        System.out.println();

        // Test 8: Even-length non-palindrome (1 <-> 2 <-> 3 <-> 4)
        System.out.println("Test 8: Even-Length Non-Palindrome");
        myList = new DoublyLinkedList(1);
        myList.append(2);
        myList.append(3);
        myList.append(4);
        System.out.print("List: ");
        myList.printList();
        System.out.println("Expected: false");
        System.out.println("Actual: " + myList.PalindromeChecker());
        System.out.println();
    }
}
