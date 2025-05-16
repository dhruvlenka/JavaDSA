package InterviewQuestions.RemoveDuplicates;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

public class RemoveDuplicatesHashSet {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,13,1,2,3};
        removeDuplicatesInArray(arr);
        System.out.println();

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(9);
        list.add(7);
        list.add(2);
        list.add(7);
        removeDuplicatesInArrayList(list);
        System.out.println();

        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(19);
        linkedList.add(20);
        linkedList.add(15);
        linkedList.add(16);
        linkedList.add(10);
        linkedList.add(16);
        removeDuplicatesInLinkedList(linkedList);
        System.out.println();

        Queue<Integer> queue = new LinkedList<>();
        queue.add(10);
        queue.add(12);
        queue.add(13);
        queue.add(10);
        queue.add(19);
        removeDuplicatesInQueue(queue);
       // System.out.println(queue);
    }
    //array: removing duplicates in array
    public static void removeDuplicatesInArray(int[] arr){
        HashSet<Integer> hash = new HashSet<>();
        for(int i=0; i<arr.length; i++){
            hash.add(arr[i]);
        }

        for(Integer i: hash){
            System.out.println(i);
        }
    }
    //arraylist: removing duplicates from arraylist
    public static void removeDuplicatesInArrayList(ArrayList<Integer> arr){
        HashSet<Integer> hash = new HashSet<>();

        for(int i=0;i<arr.size(); i++){
            hash.add(arr.get(i));
        }

        for(Integer i : hash){
            System.out.println(i);
        }
    // linkedlist:

    }
    public static void removeDuplicatesInLinkedList(LinkedList<Integer> linkedList) {
        HashSet<Integer> hash = new HashSet<>();
        for(int i=-0; i<linkedList.size(); i++){
            hash.add(linkedList.get(i));
        }

        for(Integer i: hash){
            System.out.println(i);
        }
    }

    public static void removeDuplicatesInQueue(Queue<Integer> queue){
        HashSet<Integer> hash = new HashSet<>();
        Queue<Integer> result = new LinkedList<>();

        while (!queue.isEmpty()){
            int current = queue.poll();
            if(hash.add(current)){
                result.add(current);
            }
        }
        for(Integer i: hash){
            System.out.println(i);
        }
    }
}
