package CollectionFramework.Queue;

public class PracticeQueue {
    //implementation
    int front, rear, size;
    int capacity; //how much queue you want to store in an array.
    int[] array;

    PracticeQueue (int capacity){
        this.capacity = capacity;
        front = size = 0;
        rear = capacity-1;
        array = new int[capacity];
    }


    void enqueue(int x) {
        this.rear = (this.rear+1) % this.capacity;
        this.array[this.rear] = x;
        this.size = this.size + 1;
    }
    public static void main(String[] args) {

    }
}
