package CollectionFramework.List.LinkedList.SinglyLinkedList;

class NodeMid {
    int value;
    NodeMid next;
    NodeMid (int x){
        value = x;
        next = null;
    }
}
public class MiddleOfTheLinkedList {
    public static void main(String[] args) {
        NodeMid head = new NodeMid(10);
        head.next = new NodeMid(20);
        head.next.next = new NodeMid(30);
        head.next.next.next = new NodeMid(40);
        head.next.next.next.next = new NodeMid(50);
        head.next.next.next.next.next = new NodeMid(60);
        head.next.next.next.next.next.next = new NodeMid(70);
        printList(head);
        System.out.println("Position of the element in the linked list using Naive Solution(Two Traversal): ");
        printMiddle(head);
        System.out.println("Position of the element in the linked list using One Traversal(Efficient Code): ");
        printMiddle2(head);
        // MiddleOfTheLinkedList middle = new MiddleOfTheLinkedList();;

    }
    //Naive Solution
    static void printMiddle(NodeMid head){
        if (head == null) return;
        int count = 0;
        NodeMid curr;
        // initialization, condition,  iteration
        for (curr = head; curr != null; curr = curr.next) {
            count++;
        }
        curr = head;
        for (int i=0;i<count/2;i++){
            curr = curr.next;
        }
        System.out.println(curr.value);
    }
    //Efficient Solution (One Traversal): method 2
    static void printMiddle2(NodeMid head){
        if(head==null)return;
        //slow modes 1 node at a time
        //fast moves 2 node at a time
        //fast reaches end, slow reaches middle
        NodeMid slow=head,fast=head;
        while(fast!=null &&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        System.out.print(slow.value);
    }
    static void printList(NodeMid head){
        NodeMid curr = head;
        while (curr != null){
            System.out.println(curr.value + " ");
            curr = curr.next;
        }
        System.out.println();
    }
}


