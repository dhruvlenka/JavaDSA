package OOPS;

//1) super is used to refer immediate parent class instance variable.
class car {
    String color = "Black";
}

class carColor extends car {
    String color = "White";

    void printColor(){
        System.out.println(color);
        System.out.println(super.color);
    }
}

public class SuperKeyword {
    public static void main(String[] args) {
       carColor c = new carColor();
       c.printColor();
    }
}
