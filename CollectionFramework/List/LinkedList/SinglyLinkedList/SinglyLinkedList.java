package CollectionFramework.List.LinkedList.SinglyLinkedList;

//implementation
public class SinglyLinkedList {
    //Creating class
    static class Node{
        int value; //a data item
        Node next; //here Node is: self-referential structure, next: an address of another node
        Node (int x){ //constructor
            value = x; //initialized to parameter x
            next = null; //this line is optional if you do not initialize a member it becomes null by default.
        }
    }

    public static void main(String[] args) {
        //assigning values
        //obj
        Node head = new Node(10);
        Node first = new Node(20);
        Node second = new Node(30);
        Node third = new Node(40);
        head.next = first;
        first.next = second;
        second.next = third;

        //printing using .next.value
        System.out.println(head.value);
        System.out.println(head.next.value);
        System.out.println(head.next.next.value);
        System.out.println(head.next.next.next.value);
        System.out.println();

        //	System.out.print(head.data+"-->"+temp1.data+"-->"+temp2.data);
        //printing using while loop
        while(head != null) {
            System.out.println(head.value);
            head = head.next;
        }
    }
}
