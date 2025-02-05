package OOPS.WrapperClass;

class Fruits {}
class Banana extends Fruits {}
class Apple {}
public class InstanceOf {
    public static void main(String[] args) {
        Fruits f = new Banana();
        System.out.println(f instanceof Fruits); //true
        System.out.println(f instanceof Banana); //true

    }
}
