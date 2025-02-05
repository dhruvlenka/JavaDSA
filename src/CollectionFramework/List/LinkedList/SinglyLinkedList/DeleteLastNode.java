package CollectionFramework.List.LinkedList.SinglyLinkedList;

//Deleting last node of the linked list
class node3 {
    int value;
    node3 next;
    node3 (int x){
        value = x;
        next = null;
    }
}
public class DeleteLastNode {
    public static void main(String[] args) {
        node3 head = new node3(21);
        head.next = new node3(24);
        head.next.next = new node3(36);
        printlist(head);
        head = delLast(head);
        printlist(head);
    }
    static node3 delLast (node3 head) {
        if (head == null) return null;
        if (head.next == null) return null;
        node3 curr = head;
        //we take .next.next because we have to delete the value which last value are null
        //understand this way nodes 24,36 - null  .next.next - null
        while (curr.next.next != null)
            curr = curr.next;
        curr.next = null;
        return head;
    }
    public static void printlist(node3 head){
        node3 curr = head;
        while (curr != null){
            System.out.print(curr.value + " ");
            curr = curr.next;
        }
        System.out.println();
    }
}
