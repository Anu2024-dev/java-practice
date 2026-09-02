package LINKEDLISTDEMO.SCOOTYBARRET;

import LINKEDLISTDEMO.SCOOTYBARRET.LinkedList.Node;

public class Main {
    public static void main(String[] args) {
        LinkedList myLinkedList = new LinkedList(0);
        // myLinkedList.printAll();
        myLinkedList.append(1);
        myLinkedList.append(2);
        myLinkedList.append(3);
        // myLinkedList.printAll();
        // System.out.println(myLinkedList.removeLast().value);
        // System.out.println(myLinkedList.removeLast().value);
        // System.out.println(myLinkedList.removeLast());
        // myLinkedList.Prepend(1);
        // myLinkedList.printAll();
        // System.out.println(myLinkedList.removeFirst().value);
        // System.out.println(myLinkedList.removeFirst().value);
        // System.out.println(myLinkedList.removeFirst().value);
        // System.out.println(myLinkedList.removeFirst());
        System.out.println(myLinkedList.get(3).value);
        myLinkedList.set(2, 99);

        System.out.println("\nLinked List after set():");
        myLinkedList.printList();
        myLinkedList.insert(1, 2);

        System.out.println("\nLL after insert(2) in middle:");
        myLinkedList.printList();

        myLinkedList.insert(0, 0);

        System.out.println("\nLL after insert(0) at beginning:");
        myLinkedList.printList();

        myLinkedList.insert(4, 4);

        System.out.println("\nLL after insert(4) at end:");
        myLinkedList.printList();

        System.out.println("\nRemoved node:");
        System.out.println(myLinkedList.remove(2).value);
        System.out.println("LL after remove() in middle:");
        myLinkedList.printList();

        System.out.println("\nRemoved node:");
        System.out.println(myLinkedList.remove(0).value);
        System.out.println("LL after remove() of first node:");
        myLinkedList.printList();

        System.out.println("\nRemoved node:");
        System.out.println(myLinkedList.remove(2).value);
        System.out.println("LL after remove() of last node:");
        myLinkedList.printList();
        myLinkedList.reverse();

        System.out.println("\nLL after reverse():");
        myLinkedList.printList();

        System.out.println("The linkedlist 1 -> 2 -> 3 -> 4 -> 5::");
        LinkedList myList2 = new LinkedList(1);
        myList2.append(2);
        myList2.append(3);
        myList2.append(4);
        myList2.append(5);
        Node middleNode = myList2.findMiddleNode();
        System.out.println(middleNode.value);
        System.out.println("The linkedlist 1 -> 2 -> 3 -> 4 -> 5  -> 6::");
        myList2.append(6);
        middleNode = myList2.findMiddleNode();
        System.out.println(middleNode.value);
        System.out.println(myList2.hasLoop());
        System.out.println("test 1: one node(loop to itself");
        myLinkedList = new LinkedList(1);
        myLinkedList.getHead().next = myLinkedList.getHead();
        System.out.println(myLinkedList.hasLoop());
        System.out.println("test 2:multi-node(loop to head");
        myLinkedList = new LinkedList(1);
        myLinkedList.append(2);
        myLinkedList.append(3);
        myLinkedList.append(4);
        myLinkedList.getTail().next = myLinkedList.getHead();
        System.out.println(myLinkedList.hasLoop());
        System.out.println("Test 6:multi-node(loop to middle node)");
        myLinkedList = new LinkedList(1);
        myLinkedList.append(2);
        myLinkedList.append(3);
        myLinkedList.append(4);
        LinkedList.Node middle = myLinkedList.getHead().next.next;
        myLinkedList.getTail().next = middle;
        System.out.println(myLinkedList.hasLoop());
        System.out.println("printing the k th element");
        myLinkedList = new LinkedList(1);
        myLinkedList.append(2);
        myLinkedList.append(3);
        myLinkedList.append(4);
        myLinkedList.append(5);
        Node result = myLinkedList.findKthFromEnd(1);
        System.out.println(result.value);
        System.out.println("Test 7: Mixed Duplicates");
        myLinkedList = new LinkedList(1);
        myLinkedList.append(2);
        myLinkedList.append(1);
        myLinkedList.append(3);
        myLinkedList.append(2);
        myLinkedList.append(4);
        myLinkedList.removeDuplicates();
        System.out.println("Expected: 1 -> 2 -> 3 -> 4");
        myLinkedList.printList();
        System.out.println("Test 5: Multi-Node (1111)");
        myLinkedList = new LinkedList(1);
        myLinkedList.append(1);
        myLinkedList.append(1);
        myLinkedList.append(1);
        System.out.print("List: ");
        myLinkedList.printList();
        System.out.println("Expected: 15");
        System.out.println("Actual: " + myLinkedList.binaryToDecimal());
        System.out.println();

        // Test 6: Multi-node (10010)
        System.out.println("Test 6: Multi-Node (10010)");
        myLinkedList = new LinkedList(1);
        myLinkedList.append(0);
        myLinkedList.append(0);
        myLinkedList.append(1);
        myLinkedList.append(0);
        System.out.print("List: ");
        myLinkedList.printList();
        System.out.println("Expected: 18");
        System.out.println("Actual: " + myLinkedList.binaryToDecimal());
        System.out.println();
        System.out.println("Test 6: Mixed Nodes");
        myLinkedList = new LinkedList(3);
        myLinkedList.append(5);
        myLinkedList.append(8);
        myLinkedList.append(5);
        myLinkedList.append(10);
        myLinkedList.append(2);
        myLinkedList.append(1);
        myLinkedList.partitionList(5);
        System.out.println("Original List: 3 -> 5 -> 8 -> 5 -> 10 -> 2 -> 1");
        System.out.println("Expected: 3 -> 2 -> 1 -> 5 -> 8 -> 5 -> 10");
        myLinkedList.printList();
        System.out.println();

        // Test 7: Nodes with duplicates around pivot
        System.out.println("Test 7: Duplicates Around Pivot");
        myLinkedList = new LinkedList(5);
        myLinkedList.append(1);
        myLinkedList.append(5);
        myLinkedList.append(0);
        myLinkedList.append(5);
        myLinkedList.partitionList(5);
        System.out.println("Original List: 5 -> 1 -> 5 -> 0 -> 5");
        System.out.println("Expected: 1 -> 0 -> 5 -> 5 -> 5");
        myLinkedList.printList();
        System.out.println();
        System.out.println("reverse between");
        myLinkedList = new LinkedList(1);
        myLinkedList.append(2);
        myLinkedList.append(3);
        myLinkedList.append(4);
        myLinkedList.append(5);
        // myLinkedList.reverseBetween(1, 3);
        myLinkedList.swapBetween();
        myLinkedList.printList();
    }
}
