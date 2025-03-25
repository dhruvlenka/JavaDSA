package OOPS;

//3) super is used to invoke parent class constructor.
class Shoes {
    Shoes(){
        System.out.println("Shoes");
    }
}

class Adidas extends Shoes {
    Adidas(){
        super();
        System.out.println("Adidas");
    }
}
public class SuperKeyword3 {
    public static void main(String[] args) {
        Adidas plrphase = new Adidas();
    }
}
