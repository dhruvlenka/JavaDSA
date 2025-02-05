package CollectionFramework.List.LinkedList.SinglyLinkedList;

////Finding n-th node form end of the linked list using two pointers approach.
class nth2 {
    int data;
    nth2 next;
    nth2 (int x){
        data = x;
        next = null;
    }
}
public class NthNode2 {
    public static void main(String[] args) {
        nth2 head = new nth2(10);
        head.next = new nth2(20);
        head.next.next = new nth2(30);
        head.next.next.next = new nth2(40);
        head.next.next.next.next = new nth2(50);
        System.out.println("Linked List: ");
        printList(head);

        System.out.println();
        System.out.println("What's the value in 1st Last Node ?  ");
        printNthFromEnd(head,2);

    }
    //Two pointer approach to find the nth last node
    static void printNthFromEnd(nth2 head,int n){
        if(head == null)return;
        nth2 first = head;
        for(int i=0; i<n; i++){
            if(first == null) return;
            first = first.next;
        }
        nth2 second=head;
        while(first != null){
            second = second.next;
            first = first.next;
        }
        System.out.print(second.data);
    }
    //printing the lineked list
    public static void printList(nth2 print){
        nth2 curr = print;
        while (curr != null){
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
    }
}
