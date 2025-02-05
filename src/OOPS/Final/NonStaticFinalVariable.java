package OOPS.Final;

public class NonStaticFinalVariable {
    String name;
    final int id;
    double salary;

    /*
    default constructor wil be not allowed here
    because when constructor will load name can be null
    but id can not be 0 because if it became 0 it will be final
    and it can not be changed.

     */
    NonStaticFinalVariable(int id) {
        this.id = id;
    }

    NonStaticFinalVariable(String name, int id) {
        this.name = name;
        this.id = id;
    }

    /*
    No matter how many constructor you made
    final id is mandatory in all constructor
    if you didn't use the id the error
    will occur.
     */

    NonStaticFinalVariable(String name,int id, double salary){
        this.name = name;
        this.id = id;
        this.salary = salary;
    }
}
