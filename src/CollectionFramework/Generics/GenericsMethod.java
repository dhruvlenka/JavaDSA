package CollectionFramework.Generics;

//Creating a collectionFramework.Generics.collectionFramework.Generics Method
class GenMethod{
    <D> void genericsMethod(D data){
        System.out.println("Generic Method:");
        System.out.println("Data Passed: " + data);
    }
}
 /*
  Where:
  collectionFramework.Generics.GenMethod, is a generic method.
  The type parameter <D> is inserted after the modifier
  public and before the return type void.
 */
public class GenericsMethod {
    public static void main(String[] args) {
        GenMethod method = new GenMethod();

        //generics method working with Integer
        method.<Integer>genericsMethod(22);

        //generics method working with Float
        method.<Float>genericsMethod(8.5f);

        //another way to write without type parameter
        method.genericsMethod("Learning collectionFramework.Generics.collectionFramework.Generics");

         /*
        Above, we call the generics methods by placing the actual
        type <String>, <Integer>, <Float> inside the angle bracket
        before the method name.

        Note: We can call the generics method without including
        the type parameter. For example,
        method.genericsMethod(8.5f);
        In this case,
        the compiler can match the type parameter based on the
        value passed to the method.
         */
        
    }
}
