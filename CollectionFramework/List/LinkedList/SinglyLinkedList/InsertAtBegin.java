package CollectionFramework.List.LinkedList.SinglyLinkedList;


//Insert at Begin of Singly Linked List
//class NODE
class NodeList {
    String value;
    NodeList next;
    NodeList(String str){
        value = str;
        next = null;
    }
}
public class InsertAtBegin {
    static NodeList insertAtBegin(NodeList head, String str){
        //inserting at begin of the linked list
        NodeList newNode = new NodeList(str);
        newNode.next = head;
        return newNode;
    }
    public static void main(String[] args) {
        NodeList head = null;
        head = insertAtBegin(head,"Harshit"); //reverse order
        head = insertAtBegin(head,"Dhruv");
        head = insertAtBegin(head, "Ayush");
        printlist(head);

    }
    public static void printlist(NodeList head){
        NodeList curr = head;
        while(curr != null){
            System.out.println(curr.value + " ");
            curr = curr.next;
        }
    }
}
