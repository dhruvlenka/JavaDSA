package CollectionFramework.List.LinkedList.SinglyLinkedList;


class NodeSort{
    int value;
    NodeSort next;
    NodeSort (int x){
        value = x;
        next = null;
    }
}
public class SortedInsertInALinkedList {
    NodeSort sortedInsert(NodeSort head, int x) {
        NodeSort temp = new NodeSort(x);
        if (head == null) {
            return temp;
        }
        if (x < head.value) {
            temp.next = head;
            return temp;
        }
        NodeSort curr = head;
        while (curr.next != null && curr.next.value < x) {
            curr = curr.next;
        }
        temp.next = curr.next;
        curr.next = temp;
        return head;
    }
    public static void main(String[] args) {
        //Creating a linked list with some values
        NodeSort head = new NodeSort(18);
        head.next = new NodeSort(30);
        head.next.next = new NodeSort(35);

        //Creating instance of the SortedInsertInALinkedList
        SortedInsertInALinkedList sorted = new SortedInsertInALinkedList();
        head = sorted.sortedInsert(head,100);

        NodeSort curr = head;
        while (curr != null){
            System.out.println(curr.value + " ");
            curr = curr.next;
        }
    }
}
