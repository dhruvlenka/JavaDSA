package OOPS.Polymorphism;

public class GameDriverOverriding {
    public static void main(String[] args) {
        Game g1 = new Game(); //upcasting
        Shape s1 = g1.selectedShape(); //overloading
        s1.solve();
    }
}
