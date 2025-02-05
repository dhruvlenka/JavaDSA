package CollectionFramework.List.LinkedList.SinglyLinkedList;



import java.util.ArrayList;

//Singly: Iterative: Naive Solution and Efficient Solution
class reverseNODE {
    int data;
    reverseNODE next;
    reverseNODE(int x){
        data = x;
        next = null;
    }
}
public class ReverseLinkedList {
    public static void main(String[] args) {
        reverseNODE head = new reverseNODE(20);
        head.next = new reverseNODE(22);
        head.next.next = new reverseNODE(24);
        head.next.next.next = new reverseNODE(30);
        head.next.next.next.next = new reverseNODE(35);
        System.out.println("Given Linked List: ");
        printList(head);

        System.out.println();
        System.out.println("Reversed Linked List(Naive Code): ");
        head = reverse(head);
        printList(head);
        System.out.println();

        System.out.println("Reversed Linked List(Efficient Solution): ");
        head = reverse2(head);
        printList(head);

    }
    //Reversing using ArrayList: Naive Solution
    static reverseNODE reverse(reverseNODE head){
        ArrayList<Integer> arr = new ArrayList<>();
        for (reverseNODE curr = head; curr != null; curr = curr.next){
            arr.add(curr.data);
        }
        for (reverseNODE curr = head; curr != null; curr = curr.next){
            curr.data = arr.remove(arr.size()-1);
        }
        return head;
    }
    //Efficient Solution
    static reverseNODE reverse2(reverseNODE head){
        reverseNODE curr=head;
        reverseNODE prev=null;
        while(curr != null){
            reverseNODE next=curr.next;
            curr.next=prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    public static void printList(reverseNODE print){
        reverseNODE curr = print;
        while (curr != null){
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
    }
}
