package LLprac;

public class Dll {
    private Node head;
    private Node tail;
    private int length;
    class Node{
        int value;
        Node next;
        Node prev;
        Node(int value){
            this.value=value;
        }
    } 
    public Dll(int value){
        Node newNode=new Node(value);
        head=newNode;
        tail=newNode;
        length=1;
    }
     public void printList(){
        Node curr=head;
        while(curr != null){
            System.out.print(curr.value+"<->");
            curr=curr.next;
        }
        System.out.println("");
    }
    public void append(int value){
        Node newNode=new Node(value);
        if(length==0) {
            head=newNode;
            tail=newNode;
        }else{
        tail.next=newNode;
        newNode.prev=tail;
        tail=newNode;
        }
        length++;
    }
    public Node removeLast(){
        if(length==0) return null;
        Node temp=tail;
        if(length==1){
           head=null;
           tail=null; 
        }else{
        tail=tail.prev;
        tail.next=null;
        temp.prev=null;
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
            head.prev=newNode;
            head=newNode;

        }
        length++;
    }
    public Node removeFirst(){
        if(length==0){
            return null;
        }
        Node temp=head;
        if(length==1){
            head=null;
            tail=null;
        }else{
            head=head.next;
            head.prev=null;
            temp.next=null;
        }
        length--;
        return temp;
    }
    public Node get(int index){
        if(index<0 || index>=length) return null;
        Node temp=head;
        if(index<length/2){
            for(int i=0;i<index;i++){
            temp=temp.next;
        }
        }else{
            temp=tail;
            for(int i=length-1;i>index;i--){
                temp=temp.prev;
            }
        }
        
        return temp;
    }
    public boolean set(int index,int value){
        Node temp=get(index);
        if(temp!=null){
            temp.value=value;
            return true;
        }
        return false;
    }
    public boolean insert(int index,int value){
        if(index<0||index>length){
            return false;
        }
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
        Node after=before.next;
        newNode.prev=before;
        newNode.next=after;
        before.next=newNode;
        after.prev=newNode;
        length++;
        return  true;

    }
    public Node remove(int index){
        if(index<0||index>=length) return null;
        if(index==0) return removeFirst();
        if(index==length-1) return removeLast();
        Node temp=get(index);
        temp.next.prev=temp.prev;
        temp.prev.next=temp.next;
        temp.next=null;
        temp.prev=null;
        length--;
        return temp;

    }
    public void reverse(){
        Node temp=head;
        head=tail;
        tail=temp;
        while(temp!=null){
            Node swap=temp.next;
            temp.next=temp.prev;
            temp.prev=swap;
            temp=temp.prev;
        }
    }
    public void partition(int k){
        Node d1=new Node(0);
        Node d2 = new Node(0);
        Node p1=d1;
        Node p2=d2;
        Node cur=head;
        while(cur!=null){
            if(cur.value<k){
                p1.next=cur;
                cur.prev=p1;
                p1=cur;
            }else{
                p2.next=cur;
                cur.prev=p2;
                p2=cur;
            }
            cur=cur.next;
        }
        p2.next=null;
        p1.next=d2.next;
        if(d2.next!=null){
            d2.next.prev=p1;
        }
        head=d1.next;
        if(head!=null){
            head.prev=null;
        }

    }
    public void reversebtn(int m,int n){
        if(m==n||head==null||head.next==null) return;
        Node dummy=new Node(0);
        Node p1=dummy;
        dummy.next=head;
        head.prev=dummy;
        for(int i=0;i<m;i++){
            p1=p1.next;
        }
        Node cur=p1.next;
        for(int i=0;i<n-m;i++){
            Node tomove=cur.next;
            cur.next=tomove.next;
            if(tomove.next!=null){
                tomove.next.prev=cur;
            }
            tomove.next=p1.next;
            p1.next.prev=tomove;
            p1.next=tomove;
            tomove.prev=p1;
        }
        head=dummy.next;
          
    }
}
