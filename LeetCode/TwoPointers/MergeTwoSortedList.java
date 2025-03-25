package TwoPointers;
//Leetcode: 21
class Node{
    int data;
    Node next;
    Node (int x){
        data = x;
        next = null;
    }

}
public class MergeTwoSortedList {
    public static void main(String[] args) {
        Node head = new Node(2);
        head.next = new Node(4);
        head.next.next = new Node(6);

        Node head2 = new Node(1);
        head2.next = new Node(3);
        head2.next.next = new Node(5);

        //way 1 to print the sorted list
        head = mergeTwoLists(head,head2);
        printList(head2);

        //way 2 to print the sorted list
        /*
         MergeTwoSortedList merge = new MergeTwoSortedList();
        Node mergedList = merge.mergeTwoLists(head,head2);

        while (mergedList != null){
            System.out.println(mergedList.data + " ");
            mergedList = mergedList.next;
        }
         */


    }
    public static Node mergeTwoLists(Node list1, Node list2) {
        Node temp = new Node(0);
        Node tail = temp;

        while (list1 != null && list2 != null) {
            if (list1.data < list2.data) {
                tail.next = list1;
                list1 = list1.next;
            } else {
                tail.next = list2;
                list2 = list2.next;
            }
            tail = tail.next;
        }
        if (list1 != null) {
            tail.next = list1;
        }
        if (list2 != null) {
            tail.next = list2;
        }
        return temp.next;
    }
    public static void printList(Node print){
        Node curr = print;
        while (curr != null){
            System.out.println(curr.data + " ");
            curr = curr.next;
        }
    }
}
