package LLprac;

import java.util.HashSet;
import java.util.Set;

class LinkedList{
    class Node{
        int value;
        Node next;
        Node(int value){
            this.value=value;
        }

    }
        private Node head;
        private Node tail;
        private int length;
    public LinkedList(int value){
        Node newNode=new Node(value);
        head=newNode;
        tail=newNode;
        length=1;
    }
    public void getHead(){
        System.out.println("Head: "+head.value);
    }
    public void getTail(){
        System.out.println("Tail: "+ tail.value);
    }
    public void getLength(){
        System.out.println("Length: "+length);
    }
    public void printList(){
        Node curr=head;
        while(curr != null){
            System.out.print(curr.value+"->");
            curr=curr.next;
        }
        System.out.println("");
    }
    public void append(int value){
        Node newNode=new Node(value);
        if(length==0){
            head=newNode;
            tail=newNode;
        }
        tail.next=newNode;
        tail=newNode;
        length++;
    }
    public Node removeLast(){
        if(length==0) return null;
        Node temp=head;
        Node pre=head;
        while(temp.next!=null){
            pre=temp;
            temp=temp.next;
            
        }
        tail=pre;
        tail.next=null;

        if(length==0){
            head=null;
            tail=null;
        }
        length--;
        return temp;
    }
    public void prepend(int value){
        Node newNode=new Node(value);
        if(length==0){
            head=newNode;
            tail=newNode;
        }else{
            newNode.next=head;
            head=newNode;

        }
        length++;
    }
    public Node removeFirst(){
        if(length==0){
            return null;
        }
        Node temp=head;
        head=head.next;
        temp.next=null;
        length--;
        if(length==0){
            tail=null;
        }
        return temp;
    }
    public Node get(int index){
        if(index<0||index>=length) return null;
        Node temp=head;
        for(int i=0;i<index;i++){
            temp=temp.next;
        }
        return temp;

    }
    public boolean set(int index,int value){
        Node temp=get(index);
        if(temp!=null){
            temp.value=value;
            return  true;
        }
        return false;
    }
    public boolean insert(int index,int value){
        if(index<0 || index>length) return false;
        if(index==0){
            prepend(value);
            return true;
        }
        if(index==length){
            append(value);
            return true;
        }
        Node newNode=new Node(value);
        Node before=get(index-1);
            newNode.next=before.next;
            before.next=newNode;
            length++;
            return true;
    }
    public Node remove(int index){
        if(length<0||index>=length) return null;
        if(length==0) return removeFirst();
        if(length==length-1) removeLast();
        Node pre=get(index-1);
        Node temp=pre.next;
        pre.next=temp.next;
        temp.next=null;
        return temp;
    }
    // public void reverse(){
    //     Node temp=head;
    //     head=tail;
    //     tail=temp;
        
    //     Node before=null;
    //     for (int i=0;i<length;i++){
    //         Node after=temp.next;
    //         temp.next=before;
    //         before=temp;
    //         temp=after;
    //     }

    // }
     public void reverse() {
        Node temp = head;
        head = tail;
        tail = temp;
        Node after = temp.next;
        Node before = null;
        for (int i = 0; i < length; i++) {
            after = temp.next;
            temp.next = before;
            before = temp;
            temp = after;
        }
    }
    public Node findKthfromNode(int k){
        if(k<=0)return null;
        Node fast=head;
        Node slow=head;
        for(int i=0;i<k;i++){
            if(fast==null){
                return null;
            }
            fast=fast.next;
            }
            while(fast!=null){
                 slow=slow.next;
                fast=fast.next;
            }
            return slow;
    }
    public void removeDupli(){
        Set<Integer>values=new HashSet<>();
        Node curr=head;
        Node prev=null;
        while(curr!=null){
            if(values.contains(curr.value)){
                prev.next=curr.next;
                length--;
            }
            else{
                values.add(curr.value);
                prev=curr;
            }
            curr=curr.next;
        }
    }
    public void partition(int target){
        if(head==null) return;
        Node d1=new Node(0);
        Node d2=new Node(0);
        Node p1=d1;
        Node p2=d2;
        Node cur=head;
        while(cur!=null){
            if(cur.value<target){
                p1.next=cur;
                p1=cur;
            }else{
                p2.next=cur;
                p2=cur;
            }
            cur=cur.next;
        }
        p2.next=null;
        p1.next=d2.next;
        head=d1.next;
    }
    public void reversebtn(int m,int n){
        Node dummy=new Node(0);
        Node p1=dummy;
        dummy.next=head;
        for(int i=0;i<m;i++){
            p1=p1.next;
        }
        Node cur=p1.next;
        for(int i=0;i<n-m;i++){
            Node tomove=cur.next;
            cur.next=tomove.next;
            tomove.next=p1.next;
            p1.next=tomove;
        }
        head=dummy.next;

    }
    
}