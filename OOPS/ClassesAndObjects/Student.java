package OOPS.ClassesAndObjects;

public class Student {
    String studentName = "Jack Reacher"; //attributes but defined with literals
    String college = "University of London";
    String branch = "B.Tech";
    String course = "Data Analytics";
    int fees = 500000;
    int roll = 1;
    int collegeYear = 2020;

    public static void main(String[] args) {
        Student st = new Student();
        System.out.println(st.studentName);
        System.out.println(st.college);
        System.out.println(st.branch);
        System.out.println(st.course);
        System.out.println(st.fees);
        System.out.println(st.roll);
        System.out.println(st.collegeYear);
    }
}
