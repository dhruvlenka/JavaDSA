package OOPS.Encapsulation;

import java.util.Scanner;

public class Fruit {
    private int rate;
    private String name;

    //getter
    public int getRate(){
        return rate;
    }
    public String getName(){
        return name;
    }

    //setter
    public void setRate(int rate){
        this.rate = rate;
    }
    public void setName(String name){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Fruit Name: ");
        String fruit = input.nextLine();
        if(fruit.equalsIgnoreCase("banana")){
            rate = 80;
        } else if (fruit.equalsIgnoreCase("mango")){
            rate = 45;
        } else if(fruit.equalsIgnoreCase("apple")){
            rate = 100;
        }
    }

}
