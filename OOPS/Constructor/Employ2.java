package OOPS.Constructor;

public class Employ2 {
    String name;
    int id;
    double salary;
    String address;

    public Employ2(){
        System.out.println("Employ obj is created.");
    }

    public Employ2(String name){
        this();
        this.name = name;

    }

    public Employ2(String name, int id){
        this(name);
        this.id = id;

    }

    public Employ2(String name, int id, double salary){
        this(name, id);
        this.salary = salary;
    }

    public Employ2(String name, int id, double salary, String address){
        this(name, id,salary);
        this.address = address;
    }
    public void getDetails(){
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Salary: " + salary);
        System.out.println("Address: " + address);
    }

    public static void main(String[] args) {
        Employ2 e2 = new Employ2("Preert", 20);
        e2.getDetails();

    }
}
