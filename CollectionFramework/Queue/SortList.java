package CollectionFramework.Queue;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class SortList {
    public static void main(String[] args) {
        List<Integer> ll = new ArrayList<>();
        ll.add(23);
        ll.add(34);
        ll.add(12);
        ll.add(10);
        ll.add(11);
        ll.add(21);
        ll.add(22);
        ll.add(10);
        ll.add(34);
        System.out.println("List Before Sorting" + ll);
        sortListElements(ll);
        System.out.println("List After Sorting" + ll);

    }
    public static List<Integer> sortListElements(List<Integer> ll){
        Queue<Integer> qq= new PriorityQueue();
        ll.clear();

        while (!qq.isEmpty()){
            ll.add(qq.poll());
        }
        return ll;
    }
}
