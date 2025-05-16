package CollectionFramework.List.ComparableComparator;

import java.util.ArrayList;
import java.util.Comparator;

class rollComperator implements Comparator<Student>{
    public int compare(Student s1, Student s2){
        return s1.rollNo - s2.rollNo; //ascending order
        // return s2.rollNo - s1.rollNo //descending order
    }
}

public class ComperatorSortByInt {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student(9, "Lucky"));
        list.add(new Student(1, "Rishav"));
        list.add(new Student(5, "Aryan"));
        list.add(new Student(3, "Kaya"));
        list.add(new Student(2, "Priya"));

        list.sort(new rollComperator());
        for (Student s: list){
            System.out.println(s);
        }

    }
}
