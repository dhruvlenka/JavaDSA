package CollectionFramework.List.LinkedList.SinglyLinkedList;

//Deleting first node of the Linked List
class node2 {
    int value;
    node2 next;
    node2(int x){
        value = x;
        next = null;
    }
}
public class DeleteFirstNode {
    public static void main(String[] args) {
        node2 head = new node2(10);
        head.next = new node2(20);
        head.next.next = new node2(30);
        printlist(head);
        head = delHead(head);
        printlist(head);
    }
    static node2 delHead(node2 head){
        if (head == null) return null;
        else {
            return head.next;
        }
    }
    public static void printlist(node2 head){
        node2 curr = head;
        while(curr != null){
            System.out.print(curr.value + " ");
            curr = curr.next;
        }
        System.out.println();
    }
}

