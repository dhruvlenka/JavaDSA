package CollectionFramework.List.LinkedList.SinglyLinkedList;

//Finding n-th node form end of the linked list using length or traversal of the linked list.
class nth {
    int data;
    nth next;
    nth(int x){
        data = x;
        next = null;
    }
}
public class NthNode {
    public static void main(String[] args) {
        nth head = new nth(9);
        head.next = new nth(18);
        head.next.next = new nth(27);
        head.next.next.next = new nth(36);
        head.next.next.next.next = new nth(45);
        System.out.println("Linked List: ");
        printList(head);

        System.out.println();
        System.out.println("What's the value in 1st Last Node ?  ");
        printnthNodeFromEnd(head,1);
        System.out.println();
        System.out.println("What's the value in 2nd Last Node ? ");
        printnthNodeFromEnd(head,2);
        System.out.println();
        System.out.println("What's the value in 3rd Last Node ? ");
        printnthNodeFromEnd(head,3);
        System.out.println();
        System.out.println("What's the value in 4th Last Node ? ");
        printnthNodeFromEnd(head, 4);
        System.out.println();
        System.out.println("What's the value in 5th Last Node ? ");
        printnthNodeFromEnd(head,5);
    }

    //finding length then traverse the linked list
    static void printnthNodeFromEnd(nth head, int n) {
        int len = 0;
        for(nth curr=head;curr!=null;curr=curr.next)
            len++;
        if(len<n)
            return;
        nth curr=head;
        for(int i=1;i<len-n+1;i++)
            curr=curr.next;
        System.out.print(curr.data);
    }

    //printing the linked list
    public static void printList(nth head){
        nth curr = head;
        while (curr != null){
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
    }
}

