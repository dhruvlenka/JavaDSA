package CollectionFramework.List.LinkedList.SinglyLinkedList;

class NoderemDup {
    int value;
    NoderemDup next;
    NoderemDup (int x){
        value = x;
        next = null;
    }
}
public class RemoveDuplicates {
    public static void main(String[] args) {
        NoderemDup head = new NoderemDup(11);
        head.next = new NoderemDup(18);
        head.next.next = new NoderemDup(21);
        head.next.next.next = new NoderemDup(21);
        head.next.next.next.next = new NoderemDup(24);
        head.next.next.next.next.next = new NoderemDup(30);
        head.next.next.next.next.next.next = new NoderemDup(30);
        head.next.next.next.next.next.next.next = new NoderemDup(30);
        printList(head);
        System.out.println("After removing duplicates: ");
        removeDuplicates(head);
        printList(head);
    }
    static void removeDuplicates(NoderemDup head){
        NoderemDup curr = head;
        while (curr != null && curr.next != null){
            if (curr.value == curr.next.value){
                curr.next = curr.next.next;
            }else {
                curr = curr.next;
            }
        }
    }
    static void printList(NoderemDup head){
        NoderemDup curr = head;
        while (curr != null){
            System.out.println(curr.value + " ");
            curr = curr.next;
        }
    }
}
