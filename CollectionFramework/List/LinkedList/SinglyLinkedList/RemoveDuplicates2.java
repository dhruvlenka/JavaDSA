package CollectionFramework.List.LinkedList.SinglyLinkedList;

class NoderemDup2 {
    int value;
    NoderemDup2 next;
    NoderemDup2 (int x){
        value = x;
        next = null;
    }
}
public class RemoveDuplicates2 {
    public static void main(String[] args) {
        NoderemDup2 head = new NoderemDup2(1);
        head.next = new NoderemDup2(2);
        head.next.next = new NoderemDup2(3);
        head.next.next.next = new NoderemDup2(3);
        head.next.next.next.next = new NoderemDup2(4);
        head.next.next.next.next.next = new NoderemDup2(4);
        head.next.next.next.next.next.next = new NoderemDup2(5);
//        head.next.next.next.next.next.next.next = new NoderemDup2(13);
//        head.next.next.next.next.next.next.next.next = new NoderemDup2(14);
//        head.next.next.next.next.next.next.next.next.next = new NoderemDup2(14);
        //printing the nodes of the linked list
        printList(head);
        System.out.println("After removing all nodes that have duplicate elements: ");
        removeallNodes(head);
        printList(head);

    }
    static void removeallNodes(NoderemDup2 head){
        NoderemDup2 curr = head;
        while (curr.next != null && curr.next.next != null){
            if (curr.next.value == curr.next.next.value){
                int val = curr.next.value;
                while (curr.next != null && curr.next.value == val){
                    curr.next = curr.next.next;
                }
            }else {
                curr = curr.next;
            }
        }
        //  System.out.println(curr.next);
    }
    static void printList(NoderemDup2 head){
        NoderemDup2 curr = head;
        while (curr != null){
            System.out.println(curr.value + " ");
            curr = curr.next;
        }
    }
}

