package OOPS.Polymorphism;

import java.util.Scanner;

public class Game {
    //Shape class is from: PolyMorphismExShape.java
    public Shape selectedShape(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Press 1 ==> For Circle");
        System.out.println("Press 2 ==> For Rectangle");
        System.out.println("Press 3 ==> For Triangle");
        System.out.println("Press 4 ==> For Square");

        int choice = sc.nextInt();
        if(choice == 1){
            System.out.println("You have selected Circle.");
            Circle c1 = new Circle();
            return c1;
        } else if(choice == 2){
            System.out.println("You have selected Rectangle");
            return new Rectangle();
        } else if(choice == 3){
            System.out.println("You have selected Square");
            return new Square();
        } else if(choice == 4){
            System.out.println("You have selected Triangle.");
            return new Triangle();
        } else {
            System.out.println("You pressed wrong number, kindly choose the right one.");
        }
        return selectedShape();
    }
}
