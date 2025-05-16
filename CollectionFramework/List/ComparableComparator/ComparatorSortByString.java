package CollectionFramework.List.ComparableComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

//comparatot to sort by name
 class NameComparator implements Comparator<Student> {
    public int compare(Student s1, Student s2) {
        return s1.name.compareTo(s2.name);
    }
}

public class ComparatorSortByString {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student(45, "Dhruv"));
        list.add(new Student(10, "Aman Raj"));
        list.add(new Student(25, "Harshit"));
        list.add(new Student(14, "Jack"));

        Collections.sort(list, new NameComparator());
      //   list.sort(new NameComparator());
        for (Student s: list){
            System.out.println(s);
        }
    }
}
