package CollectionFramework.Queue;

public class Queue_Array {
     int maxSize; //final
     int front; //private
     int rear; //private
     int[] queueArray; //array

    //constructor to initialize the queue with a given size
    Queue_Array(int size){
        maxSize = size;
        front = 0;
        rear = -1;
        queueArray = new int[maxSize];
    }

    boolean isFull(){
        return rear == maxSize -1;
    }

    boolean isEmpty() {
        return front > rear;
    }

    int size() {
        return  rear - front + 1;
    }

    void enqueue(int value){
        if (isFull()){
            System.out.println("Queue is full, Cannot enqueue " + value);
        } else {
            rear++;
            queueArray[rear] = value;
            System.out.println(value + " enqueued to the queue.");
        }

    }

    void dequeue() {
        if (isEmpty()){
            System.out.println("Queue is already Empty, cannot dequeue.");
        } else {
            int dequeuedValue = queueArray[front];
            front++;
            System.out.println(dequeuedValue + " is dequeued from the Queue.");

        }
    }
    public static void main(String[] args) {
        Queue_Array que = new Queue_Array(10);
        que.enqueue(18);
        que.enqueue(24);
        que.enqueue(45);
        que.enqueue(48);
        que.enqueue(50);
        que.enqueue(55);
        que.enqueue(65);
        que.enqueue(68);
        que.enqueue(70);
        que.enqueue(71);
        System.out.println("Queue Size: " + que.size());
        System.out.println("Queue isEmpty? " + que.isEmpty());
        que.dequeue();
        System.out.println("New Queue Size: " + que.size());
    }
}
