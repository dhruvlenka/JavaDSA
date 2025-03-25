package CollectionFramework.Generics;

public class AttendenceRegister<T, U>{
    T roll; //T: type
    U name; //U: type

    //constructor
    AttendenceRegister(T roll, U name){
        this.roll = roll;
        this.name = name;
    }
    public void getDetails() {
        System.out.println("Roll Number " + roll);
        System.out.println("Name is " + name);
    }
}
