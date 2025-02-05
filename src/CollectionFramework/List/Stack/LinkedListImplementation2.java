package CollectionFramework.List.Stack;

//Linked List Implementation of Java
class Node{
    int data;
    Node next;
    Node(int d){
        data=d;
        next=null;
    }
}

 class LinkedListImplementation2 {
     Node head;
     int sz;

     LinkedListImplementation2() {
         head = null;
         sz = 0;
     }

     void push(int x) {
         Node temp = new Node(x);
         temp.next = head;
         head = temp;
         sz++;
     }

     int pop() {
         if (head == null) {
             return Integer.MAX_VALUE;
         }
         int res = head.data;
         Node temp = head;
         head = head.next;
         sz--;
         return res;
     }

     int peek() {
         if (head == null) {
             return Integer.MAX_VALUE;
         }
         return head.data;
     }

     int size() {
         return sz;
     }

     boolean isEmpty() {
         return head == null;
     }

     public static void main(String[] args) {
         LinkedListImplementation2 list = new LinkedListImplementation2();
         list.push(10);
         list.push(20);
         list.push(30);
         System.out.println(list.peek());
         System.out.println(list.pop());
         list.push(40);
         System.out.println(list.size());
         System.out.println(list.isEmpty());
     }
 }