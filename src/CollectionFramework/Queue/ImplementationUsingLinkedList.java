package CollectionFramework.Queue;

//Queue Implementation using Linked List
class QueueNODE {
    int value;
    QueueNODE next;
    QueueNODE (int x){
        value = x;
        next = null;
    }
    //or you can write like this
     /*
      public QueueNODE(int key) {
        this.key = key;
        this.next = null;
    }
     */
}
class QueueLL {
    QueueNODE front, rear; //front, rear are references variable.
    int size;
    public QueueLL(){
        front = null;
        rear = null;
        size = 0;
        //or you can write this way: this.front = this.rear = null;

    }
    void enqueue(int value) {
        QueueNODE temp = new QueueNODE(value);
        //you can also write this way: var temp = new QueueNODE(value);
        size++;
        if (rear == null){
            front = rear = temp;
            return;
        }
        rear.next = temp;
        rear = temp;
    }
    void dequeue(){
        if (front == null){
            return;
        }
        QueueNODE temp = front;
        front = front.next;
        //you can also write this: front = front.next;

        //if you want to delete last item of the queue: front=rear = null;
        if (front == null)
            rear = null;
    }
}
public class ImplementationUsingLinkedList {
    public static void main(String[] args) {
        QueueLL q = new QueueLL();
        q.enqueue(10);
        q.enqueue(20);
        q.dequeue();
        q.dequeue();
        q.enqueue(30);
        q.enqueue(40);
        q.enqueue(50);
        q.dequeue();
        System.out.println("Queue Front "+q.front.value);
        System.out.println("Queue Rear: "+q.rear.value);
        System.out.println(q.size);
    }
}
