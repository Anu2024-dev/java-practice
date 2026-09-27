package LINKEDLISTDEMO.SCOOTYBARRET;

public class DoublyLinkedList {
    private Node head;
    private Node tail;
    private int length;

    class Node {
        int value;
        Node next;
        Node prev;

        Node(int value) {
            this.value = value;
        }
    }

    public DoublyLinkedList(int value) {
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void getHead() {
        System.out.println("Head" + head.value);
    }

    public void getTail() {
        System.out.println("Tail" + tail.value);
    }

    public void getlength() {
        System.out.println("Length" + length);
    }

    public void append(int value) {
        Node newNode = new Node(value);
        if (length == 0) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        length++;
    }

    public Node removeLast() {
        if (length == 0)
            return null;
        Node temp = tail;
        if (length == 1) {
            head = null;
            tail = null;
        } else {
            tail = tail.prev;
            temp.next = null;
            temp.prev = null;
        }
        length--;
        return temp;
    }

    public void prepend(int value) {
        Node newnNode = new Node(value);
        if (length == 0) {
            head = newnNode;
            tail = newnNode;
        } else {
            newnNode.next = head;
            head.prev = newnNode;
            head = newnNode;
        }
        length++;
    }

    public Node removeFirst() {
        if (length == 0)
            return null;
        Node temp = head;
        if (length == 1) {
            head = null;
            tail = null;
        } else {
            head.next = head;
            head.prev = null;
            temp.next = null;
        }
        length--;
        return temp;
    }

    public Node get(int index) {
        if (index < 0 || index >= length)
            return null;
        Node temp = head;
        if (index < length / 2) {
            for (int i = 0; i < index; i++) {
                temp = temp.next;
            }
        } else {
            temp = tail;
            for (int i = length - 1; i > index; i++) {
                temp = tail.prev;
            }
        }
        return temp;
    }

    public boolean set(int index, int value) {
        Node temp = get(index);
        if (temp != null) {
            temp.value = value;
            return true;
        }
        return false;
    }

    public boolean insert(int index, int value) {
        if (index < 0 || index > length)
            return false;
        if (index == 0) {
            prepend(value);
            return true;
        }
        if (index == length) {
            append(value);
            return true;
        }
        Node newNode = new Node(value);
        Node before = get(index - 1);
        Node after = before.next;
        newNode.prev = before;
        newNode.next = after;
        before.next = newNode;
        after.prev = newNode;
        length++;
        return true;
    }

    public Node remove(int index) {
        if (index < 0 || index >= length)
            return null;
        if (index == 0)
            return removeFirst();
        if (index == length - 1)
            return removeLast();
        Node temp = get(index);
        temp.next.prev = temp.prev;
        temp.prev.next = temp.next;
        temp.next = null;
        temp.prev = null;
        length--;
        return temp;
    }
    public boolean PalindromeChecker(){
        if(length==1) return true;
        Node before=head;
        Node after=tail;
        for (int i=0;i<length/2;i++){
            if(before.next!=after.prev){
                return false;
            }
            before=before.next;
            after=after.next;
        }
        return true;
    }
    public void reverse(){
        Node curr=head;
        Node temp=null;
        while(curr!=null){
            temp=curr.prev;
            curr.prev=curr.next;
            curr.next=temp;
            curr=curr.prev;

        }
       temp=head;
       head=tail;
       tail=temp;
    }
    public void partitionList(int x){
        if(head==null) return;
            Node d1=new Node(0);
            Node d2=new Node(0);
            Node p1=d1;
            Node p2=d2;
            Node curr=head;
            while(curr!=null){
                if(curr.value<x){
                    p1.next=curr;
                    curr.prev=p1;
                    p1=curr;
                }else{
                    p2.next=curr;
                    curr.prev=p2;
                    p2=curr;
                }
                curr=curr.next;
            }
            p2.next=null;
            p1.next=d2.next;
            if(d2.next!=null){
                d2.next.prev=p1;
            }
            head=d1.next;
            if(head != null){
                head.prev=null;
            }
        
    }
    public void reverseBetween(int startIndex, int endIndex) {
        
        if(head == null || startIndex == endIndex || head.next == null) return;
        
        
        Node dummy = new Node(0);
        dummy.next = head;
        head.prev = dummy;
        
        Node prev = dummy;
        
        for(int i=0; i<startIndex; i++){
            prev = prev.next;
        }
        
        Node curr = prev.next;
        
        for(int i=0; i<endIndex-startIndex; i++){
            Node node_to_move = curr.next;
            
            curr.next = node_to_move.next;
            
            if(node_to_move.next != null){
                
            node_to_move.next.prev = curr;
            
            }
            
            node_to_move.next = prev.next;
            prev.next.prev = node_to_move;
            
            prev.next = node_to_move;
            node_to_move.prev = prev;
            
        }
        
        head = dummy.next;
        head.prev = null;
        
    }
     public void swapPairs(){
        if(head == null || head.next == null) return;
        
        Node dummy = new Node(0);
        dummy.next = head;
        head.prev = dummy;
        
        Node prev = dummy;
        
        while(prev.next != null && prev.next.next != null){
            Node first = head;
            Node second = head.next;
            
            prev.next = second;
            first.next = second.next;
            second.next = first;
            
            second.prev =prev;
            first.prev = second;
            
            if(first.next != null){
                first.next.prev = first;
            }
            
            head = first.next;
            prev = first;
        }
        
        head = dummy.next;
        if(head != null) head.prev = null;
        
    }
    
}
