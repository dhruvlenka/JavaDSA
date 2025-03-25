package CollectionFramework.List.LinkedList.SinglyLinkedList;

//Insert at end of linked list
class node1{
    int value;
    node1 next;
    node1 (int x){
        value = x;
        next = null;
    }
}
public class InsertAtEnd {
    static node1 insertAtEnd(node1 head, int x){
        node1 temp = new node1(x);
        if (head == null) return temp;
        node1 curr = head;
        while (curr.next != null){
            curr = curr.next;
        }
        curr.next = temp;
        return head;
    }
    public static void main(String[] args) {
        node1 head = null;
        head = insertAtEnd(head,18);
        head = insertAtEnd(head,24);
        head = insertAtEnd(head,30);
        printlist(head);
    }
    //printing linked list
    public static void printlist(node1 head){
        node1 curr = head;
        while (curr != null) {
            System.out.println(curr.value + " ");
            curr = curr.next;
        }
    }
}

