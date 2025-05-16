package CollectionFramework.List.ComparableComparator;

import java.util.ArrayList;
import java.util.Comparator;

//employee class
class Employee {
    String name;
    int salary;

    Employee(String name, int salary){
        this.name = name;
        this.salary = salary;

    }
    public String toString() {
        return name + ": " + salary;
    }
}

//comperator to sort by employee salary: ascending order
class sortByEmployeeSalary implements Comparator<Employee>{
    public int compare(Employee e1, Employee e2){
        return e1.salary - e2.salary;
    }
}

//comperator to sort by employee salary: descending order
class sortByEmployeeSalaryDes implements Comparator<Employee>{
    public int compare(Employee e1, Employee e2){
        return e2.salary - e1.salary;
    }
}

//comperator to sort by employee name: ascending order
class sortByEmployeeName implements Comparator<Employee>{
    public int compare(Employee e1, Employee e2){
        return e1.name.compareTo(e2.name);
    }
}

//comperator to sort by employee name: descending order
class sortByEmployeeNameDes implements Comparator<Employee>{
    public int compare(Employee e1, Employee e2){
        return e2.name.compareTo(e1.name);
    }
}
public class ComperatorEmployeeExample {
    public static void main(String[] args) {
        ArrayList<Employee> list = new ArrayList<>();
        list.add(new Employee("John", 9000000));
        list.add(new Employee("Jack", 1500000));
        list.add(new Employee("Maverick", 1000000));
        list.add(new Employee("Sparrow", 9800000));
        list.add(new Employee("Baby", 12423));

        list.sort(new sortByEmployeeSalary());
        for(Employee e: list){
            System.out.println(e);
        }
        System.out.println(); //for space

        //second new array list
        ArrayList<Employee> list2 = new ArrayList<>();
        list2.add(new Employee("John", 9000000));
        list2.add(new Employee("Jack", 1500000));
        list2.add(new Employee("Maverick", 1000000));
        list2.add(new Employee("Sparrow", 9800000));
        list2.add(new Employee("Baby", 12423));

        list2.sort(new sortByEmployeeSalaryDes());
        for(Employee e: list2){
            System.out.println(e);
        }
        System.out.println(); //for space

        //third new array list
        ArrayList<Employee> list3 = new ArrayList<>();
        list3.add(new Employee("Kent", 9000000));
        list3.add(new Employee("Clark", 1500000));
        list3.add(new Employee("Ana Da Amras", 1000000));
        list3.add(new Employee("Sparrow", 9800000));
        list3.add(new Employee("Baby", 12423));

        list3.sort(new sortByEmployeeName());
        for (Employee e: list3){
            System.out.println(e);
        }
        System.out.println(); //for space

        ArrayList<Employee> list4 = new ArrayList<>();
        list4.add(new Employee("Kent", 9000000));
        list4.add(new Employee("Clark", 1500000));
        list4.add(new Employee("Ana Da Amras", 1000000));
        list4.add(new Employee("Sparrow", 9800000));
        list4.add(new Employee("Baby", 12423));

        list4.sort(new sortByEmployeeNameDes());
        for (Employee e: list4){
            System.out.println(e);
        }
    }
}
