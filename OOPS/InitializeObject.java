package OOPS;

/*

There are 3 ways to initialize object in Java.
1. By reference variable: is an alternate name of already existing variable.
2. By method
3. By constructor

 */

class Students {
    //reference variable
    String enrollment;
    String name;
    int age;

    //method
    void insertingRecords(String enrollment, String name, int age){
        this.enrollment = enrollment;
        this.name = name;
        this.age = age;
    }
    void displayingStudentInforamtion(){
        System.out.println(enrollment);
        System.out.println(name);
        System.out.println(age);
    }

    //default constructor
    Students(){

    }

    //parameterized constructor
    Students(String enrollment, String name, int age){
        this.enrollment  = enrollment;
        this.name = name;
        this.age = age;
    }
}

public class InitializeObject {
    public static void main(String[] args) {
        Students dhruv = new Students();
        //by reference variables
        dhruv.enrollment = "LNCABTCSE00";
        dhruv.name = "Dhruv";
        dhruv.age = 22;
        System.out.println(dhruv.enrollment);
        System.out.println(dhruv.name);
        System.out.println(dhruv.age);

        System.out.println(); //for spacing
        //by methods
        Students ayush = new Students();
        ayush.insertingRecords("LNCABTCSE001", "Ayush", 22);
        ayush.displayingStudentInforamtion();

        System.out.println(); //for spacing
        //by constructor
        Students harshit = new Students("LNCABTCSE002","Harshit", 22);
        System.out.println(harshit.enrollment);
        System.out.println(harshit.name);
        System.out.println(harshit.age);
    }
}
