package Singleton;

//SingletonClass
public class Printer {
    //step 2
    static Printer p = null;
    //step 1
    private Printer() {

    }
    //step 3
    public static Printer getInstance(){
        if(p == null){
            System.out.println("is null");
            p  = new Printer();
        }
        System.out.println("is not null.");
        return p;
    }
}
