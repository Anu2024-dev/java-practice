
package LLprac;
class Main{
    public static void main(String[] args) {
        LinkedList myll=new LinkedList(1);
       // myll.append(9);
        // // myll.getHead();
        // // myll.getTail();
        // // myll.getLength();
        // // myll.append(1);
        // // myll.printList();
        // // myll.removeLast();
        // // myll.printList();
        // // myll.prepend(5);
        // // myll.printList();
        // // myll.removeFirst();
        // // myll.printList();
        // System.out.println(myll.get(0).value);
        // myll.set(0,1);
        // myll.printList();
        // myll.insert(1, 2);
        // myll.printList();
        // myll.remove(1);
        // myll.printList();
        // myll.append(9);
        // myll.printList();
        // myll.reverse();
        //myll.insert(1, 6);
        
myll.append(4);
myll.append(3);
myll.append(2);
myll.append(5);
myll.append(2);
        myll.printList();
        //myll.removeDupli();
        myll.partition(3);
        myll.printList();
        //System.out.println(myll.findKthfromNode(1).value);
        System.out.println("finshed LL");
    //*************DLL */
    Dll mydl=new Dll(1);
    // mydl.printList();
    // mydl.append(0);
    // // mydl.printList();
    // // mydl.removeLast();
    // mydl.prepend(4);
    // mydl.removeFirst();
    // mydl.printList();
    // System.out.println(mydl.get(0).value);
    // mydl.set(0, 9);
    // mydl.insert(1, 10);
    // mydl.printList();
    // mydl.remove(1);
    // mydl.printList();
    // mydl.reverse();
    // mydl.printList();
    mydl.append(4);
    mydl.append(3);
    mydl.append(2);
    mydl.append(5);
    mydl.append(2);
    mydl.printList();
    mydl.partition(3);
    mydl.printList();

    }

}