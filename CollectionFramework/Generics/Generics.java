package CollectionFramework.Generics;

//Generic Class, T: Type
class GenericClass<T> {
    private T data;

    GenericClass() {

    }

    GenericClass(T data){
        this.data = data;
    }

    // method that return T type variable
    public T getData(){
        return data;
    }

    //method 2
    public <T> void printArray(T[] array) {
        for (T element : array) {
            System.out.println(element);
        }
    }
}
   /*
   Where:
   collectionFramework.Generics.GenericClass is a class. This class can be used
   to work with any type of data.
   <T> indicates the type parameter.
   data: is a variable of T type
   */

public class Generics {
    public static void main(String[] args) {
        //currently our GenericClass work with any type of data we know, so let'see.
        GenericClass gc = new GenericClass<>("Hello I am Generic.");
        System.out.println("String: " + gc.getData());

        gc = new GenericClass<>(24);
        System.out.println("Integer: " + gc.getData());

        gc = new GenericClass<>(10.2f);
        System.out.println("Float: " + gc.getData());

        gc = new GenericClass<>('D');
        System.out.println("Character: " + gc.getData());

        gc = new GenericClass<>(10.2222222222222d);
        System.out.println("Double " + gc.getData());

        //initializing generic class, and we are passing a String type, so now it will only store a string.
        GenericClass<String> str = new GenericClass<>("Java TNP CLASS");
        System.out.println(str.getData());

        GenericClass<Integer> INT = new GenericClass<>(22);
        System.out.println(INT.getData());

        GenericClass<Float> FLOAT = new GenericClass<>(9.5f);
        System.out.println(FLOAT.getData());

        /*
        Where:
        str: here, the type parameter T is replaced by Integer.
        Now, the collectionFramework.Generics.GenericClass works with String data.

        INT: here, the type parameter T is replaced by String.
        Now, the collectionFramework.Generics.GenericClass works with Integer data.

        FLOAT: here, the type parameter T is replaced by Float.
        Now, the collectionFramework.Generics.GenericClass works with FLOAT data.

        Here, you can see I just made a single class and that is
        working with any type of data, it's called Generic Class.
         */

        System.out.println("---------------------------");
        Integer[] intArray = {1,2,3};
        String[] strArray = {"Dhruv", "Ayush", "Harshit"};

        //accessing the method
        GenericClass method = new GenericClass<>();;
        method.printArray(intArray);
        method.printArray(strArray);


    }
}
