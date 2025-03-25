package CollectionFramework.List.LinkedList.SinglyLinkedList;

class NodePos {
    int data;
    NodePos next;
    NodePos (int x){
        data = x;
        next = null;
    }
}
public class InsertAtGivenPosition {
    public static void main(String[] args) {
        NodePos head = new NodePos(10);
        head.next = new NodePos(20);
        head.next.next = new NodePos(30);
        head.next.next.next = new NodePos(40);
        System.out.println("Linked List: ");
        printList(head);
        System.out.println();

//        //Inserting at middle of the linked list
//        int pos = 3, data = 12;
//        head = InsertPos(head, pos, data);
//        System.out.println();
//        printList(head);
//
//        //Inserting at beginning of the linked list
//        pos = 1;
//        data = 5;
//        head = InsertPos(head,pos,data);
//        System.out.println();
//        printList(head);
//
//        //Inserting at end of the linked list
//        pos = 7;
//        data = 50;
//        head = InsertPos(head,pos,data);
//        System.out.println()
//        printList(head);

        int pos = 1;
        int data = 5;
        head = InsertPos(head, pos, data);
        System.out.println();
        printList(head);
    }
    // function to create and return a Node
    static NodePos GetNode(int data) {
        return new NodePos(data);
    }

    // function to insert a Node at required position
    static NodePos InsertPos(NodePos headNode, int position, int data) {
        NodePos head = headNode;
        if (position < 1)
            System.out.print("Invalid position");

        if (position == 1) {
            NodePos newNode = new NodePos(data);
            newNode.next = headNode;
            head = newNode;
        } else {
            while (position-- != 0) {
                if (position == 1) {
                    // adding Node at required position
                    NodePos newNode = GetNode(data);

                    // Making the new Node to point to
                    // the old Node at the same position
                    newNode.next = headNode.next;

                    // Replacing current with new Node
                    // to the old Node to point to the new Node
                    headNode.next = newNode;
                    break;
                }
                headNode = headNode.next;
            }
            if (position != 1)
                System.out.print("Position out of range");
        }
        return head;
    }
    static void printList(NodePos head){
        NodePos curr = head;
        while (curr != null){
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
    }
}
