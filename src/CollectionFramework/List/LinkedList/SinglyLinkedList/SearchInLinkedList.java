package CollectionFramework.List.LinkedList.SinglyLinkedList;

//Singly Linked List
//Searching in a Linked List using Iterative Methood
class NodeL {
    int value;
    NodeL next;
    NodeL(int x){
        value = x;
        next = null;
    }
}
public class SearchInLinkedList {
    public static void main(String[] args) {

        NodeL head = new NodeL(8);
        head.next= new NodeL(39);
        head.next.next = new NodeL(22);
        head.next.next.next = new NodeL(30);
        printlist(head);
        System.out.println("Position of elements in Linked List: " + search(head));
    }
    static int search (NodeL head){
        int pos = 1;
        NodeL curr = head;
        while (curr != null){
            if (curr.value == 30){
                return pos;
            } else {
                pos++;
                curr = curr.next;
            }
        }
        return -1;
    }
    public static void printlist(NodeL head){
        NodeL curr = head;
        while (curr != null){
            System.out.println(curr.value + " ");
            curr = curr.next;
        }
        System.out.println();
    }
}
