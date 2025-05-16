package CollectionFramework.List.ComparableComparator;

public class Student {
    int rollNo;
    String name;

    Student(int rollNo, String name){
        this.rollNo = rollNo;
        this.name = name;
    }

    public String toString() {
        return rollNo + " " + name;
    }
}
