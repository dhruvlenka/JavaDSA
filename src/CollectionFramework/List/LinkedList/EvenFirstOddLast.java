package CollectionFramework.List.LinkedList;

import java.util.LinkedList;

public class EvenFirstOddLast {
    public static void main(String[] args) {
        String[] str = {"abc", "mohan", "cdef", "sohan", "ghijk", "jati"};

        LinkedList<String> ll = new LinkedList<>();
        for (int i = 0; i < str.length; i++) {
            if (str[i].length() % 2 == 0) {
                ll.addFirst(str[i]);
            } else {
                ll.addLast(str[i]);
            }
        }
        System.out.println(ll);
    }
}
