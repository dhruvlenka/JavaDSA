package OOPS;

public class Rectangle {
    int length;
    int width;
    int area;

    void area(int length, int width){
        this.length = length;
        this.width = width;
    }

    //calculating area
    void calculateArea(){
        System.out.println(length*width);
    }

    //calculating width
    void width(int area, int length){
        this.area = area;
        this.length = length;
    }

    void calculateWidth(){
        System.out.println("Width: " + area/length);
    }

    void height(int area, int width){
        this.area = area;
        this.width = width;
    }
    //calculating height
    void calculateHeight(){
        System.out.println("Height " + area/width);
    }
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        r1.area(10,10);
        r1.calculateArea();

        Rectangle r2 = new Rectangle();
        r2.area(500,300);
        r2.calculateArea();

        Rectangle r3 = new Rectangle();
        r3.width(500, 100);
        r3.calculateWidth();

        Rectangle r4 = new Rectangle();
        r4.height(500,200);
        r4.calculateHeight();
    }
}
