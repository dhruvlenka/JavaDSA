package CollectionFramework.Generics;

public class AttendenceRegisterDriver {
    public static void main(String[] args) {
        //currently it can hold any type of data on both side
        AttendenceRegister a = new AttendenceRegister(123,123);
        AttendenceRegister b = new AttendenceRegister(123,"Dhruv");
        AttendenceRegister c = new AttendenceRegister(123,45.2222);
        AttendenceRegister d = new AttendenceRegister(123,false);

        AttendenceRegister<Integer, String> a1 = new AttendenceRegister<>(123, "Dhruv");
    }
}