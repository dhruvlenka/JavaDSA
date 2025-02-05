package OOPS.Polymorphism;

class Shape { //superclass
    void solve(){
        System.out.println("Solve this");
    }
}

class Rectangle extends Shape {
    void solve() {
        System.out.println("Hi I, am Rectangle.");
    }
}

class Square extends Shape{
    void solve(){
        System.out.println("Hi I, am Square.");
    }
}

class Circle extends Shape {
    void solve(){
        System.out.println("Hi I, am Circle.");
    }
}

class Triangle extends Shape {
    void solve(){
        System.out.println("Hi, I am Triangle.");
    }
}
public class PolyMorphismExShape {
    public static void main(String[] args) {
        Shape sh = new Shape();
        sh.solve();
        Square sqr = new Square();
        sqr.solve();;
        Circle cr = new Circle();
        cr.solve();
        Triangle tr = new Triangle();
        tr.solve();


        Shape sss = new Triangle();
        sss.solve();
    }
}
