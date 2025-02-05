package OOPS;

public class AnonymousObject {
   void factorial(int n){
       int fac = 1;
       for(int i=1; i<=n; i++){
           fac = fac * i;
       }
       System.out.println("Factorial: " + fac);
   }

    public static void main(String[] args) {
       //Calling method through a reference
       AnonymousObject f1 = new AnonymousObject();
       f1.factorial(5);

        //Calling method through an anonymous object
       new AnonymousObject().factorial(6);
    }
}
