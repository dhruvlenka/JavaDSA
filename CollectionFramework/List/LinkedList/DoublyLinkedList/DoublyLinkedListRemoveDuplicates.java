package CollectionFramework.List.LinkedList.DoublyLinkedList;
 class ListNode {
     ListNode previous;
     int val;
     ListNode next;

     void displayNode(){
         System.out.print(val + "\t");
     }
 }
public class DoublyLinkedListRemoveDuplicates {
     ListNode head;
     ListNode tail;

     //Inserting elements
    void insertFirst(int value){
        ListNode n = new ListNode();
        n.val = value;
        n.previous = null;
        n.next = head;
        if (head!=null){
            head.previous = n;
        }
        head = n;
        if (tail == null){
            tail = n;
        }
    }
    void displayListForward(){
        System.out.println("Printing elements in Forward Direction: ");
        for (ListNode current = head; current!=null; current = current.next){
            current.displayNode();
        }
    }
    void displayListBackward(){
        System.out.println();
        System.out.println("Printing elements in Backward Direction: ");
        for (ListNode current = tail; current!=null; current = current.previous){
            current.displayNode();
        }
    }

    //sorting the linked list
    void sortedList(){
        for (ListNode current1 = head; current1.next != null; current1 = current1.next){
            for (ListNode current2 = current1.next; current2 != null; current2 = current2.next){
                if (current1.val >current2.val){
                    int temp = current1.val;
                    current1.val = current2.val;
                    current2.val = temp;
                }
            }
        }

    }
    //removing duplicates
    void removingDuplicates(){
        for (ListNode current1 = head; current1.next != null; current1 = current1.next){
            for (ListNode current2 = current1.next; current2 != null; current2 = current2.next){
                if (current1.val == current2.val){
                    current2.previous.next = current2.next;
                    if (current2.next != null){
                        current2.next.previous = current2.previous;
                    }
                }
            }
        }

    }
    public static void main(String[] args) {
        DoublyLinkedListRemoveDuplicates r = new DoublyLinkedListRemoveDuplicates();
        r.insertFirst(8);
        r.insertFirst(8);
        r.insertFirst(24);
        r.insertFirst(32);
        r.insertFirst(40);
        r.sortedList();
        r.removingDuplicates();
        r.displayListForward();
        r.displayListBackward();

    }
}
