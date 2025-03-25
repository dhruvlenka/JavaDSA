package CollectionFramework.List.LinkedList.SinglyLinkedList;

//Searching in a Linked List using Recursive Method
//class NODE
class no_de {
    int value;
    no_de next;
    no_de (int x){
        value  =x;
        next = null;
    }
}
public class SearchInLinkedList2 {
    public static void main(String[] args) {
        no_de head = new no_de(18);
        head.next = new no_de(51);
        head.next.next = new no_de(24);
        head.next.next.next = new no_de(55);
        System.out.println("Position of the element: "+search(head,24));
    }
    static int search(no_de head, int x){
        if(head == null) return -1;
        if(head.value == x) return 1;
        else{
            int res = search(head.next, x);
            if(res ==1) return -1;
            else return + 1;
        }
    }
}