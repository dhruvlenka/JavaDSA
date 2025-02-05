package CollectionFramework.List.LinkedList.SinglyLinkedList;


//Traversing a Linked List in java
class node {
    int value;
    node next;
    node (int x){
        value = x;
        next = null;
    }
}
public class TraverseALinkedList {
    public static void main(String[] args) {
        node head = new node(5);
        head.next = new node(10);
        head.next.next = new node(15);
        head.next.next.next = new node(20);
        head.next.next.next.next = new node(25);
        printList(head);
    }

    public static void printList(node head) {
        node curr = head;
        while(curr != null){
            System.out.println(curr.value + " ");
            curr = curr.next;
        }
    }
}
