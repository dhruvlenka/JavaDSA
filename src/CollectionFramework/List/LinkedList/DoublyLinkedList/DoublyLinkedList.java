package CollectionFramework.List.LinkedList.DoublyLinkedList;

class DoublyNode {
    DoublyNode previous;
    int data;
    DoublyNode next;

    void displayNode(){
        System.out.print(data + "\t");
    }
}

public class DoublyLinkedList{
    DoublyNode head; //jvm currently give null
    DoublyNode tail;
    void insertFirst(int value){
        DoublyNode n = new DoublyNode();
        n.data = value;
        n.previous = null;
        n.next = head;
        if (head!=null){
            head.previous = n;
        }
        head = n;
        if (tail == null){
            tail = n;
        }
    }
    void displayListForward(){
        System.out.println("Printing elements in Forward Direction: ");
        for (DoublyNode current = head; current!=null; current = current.next){
            current.displayNode();
        }
    }
    void displayListBackward(){
        System.out.println();
        System.out.println("Printing elements in Backward Direction: ");
        for (DoublyNode current = tail; current!=null; current = current.previous){
            current.displayNode();
        }
    }
    void insertLast(int value){
        DoublyNode i = new DoublyNode();
        i.data = value;
        i.previous = tail;
        i.next = null;
        if (tail != null){
            tail.next = i;
        }
        tail = i;
        if (head == null){
            head = i;
        }
    }
    void deleteFirst(){
        if (head == null){
            System.out.println("SORRY HEAD IS NULL");
        } else {
            head = head.next;
            head.previous = null;
        }
    }
    void deleteLast(){
        if (tail == null){
            System.out.println("SORRY TAIL IS NULL");
        } else {
            tail = tail.previous;
            tail.next = null;
        }
    }
    public static void main(String[] args) {
        DoublyLinkedList d = new DoublyLinkedList();
        d.insertFirst(10);
        d.insertFirst(20);
        d.insertFirst(30);
        d.insertFirst(40);
        d.insertFirst(50);
        d.insertLast(60);
        d.insertLast(70);
        d.deleteFirst();
        d.deleteLast();
        d.displayListForward();
        d.displayListBackward();
    }
}
