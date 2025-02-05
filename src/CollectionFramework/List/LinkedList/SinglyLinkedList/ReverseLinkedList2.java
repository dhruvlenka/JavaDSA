package CollectionFramework.List.LinkedList.SinglyLinkedList;



//reversing the linked list using recursive method (recursion)
class revNODE {
    int data;
    revNODE next;
    revNODE(int x){
        data = x;
        next = null;
    }
}
public class ReverseLinkedList2 {
    public static void main(String[] args) {
        revNODE head = new revNODE(8);
        head.next = new revNODE(16);
        head.next.next = new revNODE(24);
        head.next.next.next = new revNODE(32);
        head.next.next.next.next = new revNODE(40);
        head.next.next.next.next.next = new revNODE(48);

        System.out.println("Linked List: ");
        printList(head);
        System.out.println();
        System.out.println("Reversed Linekd List");
        head = recursive(head);
        printList(head);

    }
    //recursive method (recursion)
    static revNODE recursive(revNODE head){
        if (head == null || head.next == null) {
            return head;
        }
        revNODE newHead = recursive(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
        /*
        Where:
        This code uses recursion to reverse the linked list by first
        calling reverse on the next node, which returns the new head
        of the reversed linked list. It then sets the next pointer of
        the next node to point to the current node, and sets the next
        pointer of the current node to null. Finally, it returns the
        new head of the reversed linked list. This method will actually
        modify the pointers of the linked list and return the reversed linked list.

        Second Way:

         static NoDe recRevL(Node curr,Node prev){
            if(curr == null) return prev;
            NoDe next=curr.next;
            curr.next=prev;
            return recRevL(next,curr);
        }
         */
    }
    static void printList(revNODE print){
        revNODE curr = print;
        while (curr != null){
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
    }
}
