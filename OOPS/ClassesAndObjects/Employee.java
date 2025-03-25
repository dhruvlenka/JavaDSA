package OOPS.ClassesAndObjects;

public class Employee {
    String name = "Jack";
    int age;
    double sal;
    String address;

    public void work(){
        System.out.println("Employ is working.");
    }
    //Behaviour
    public void eat() {
        System.out.println("Employ is eating.");
    }

    public static int salary(int sal){
        sal += 100000;
        return sal;
    }

    public static void main(String[] args) {
        Employee emp1 = new Employee();
        System.out.println(emp1.name);
        emp1.work();
        emp1.eat();
        System.out.println(salary(100000));
    }
}

