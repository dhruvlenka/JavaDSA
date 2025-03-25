package OOPS.Encapsulation;

import java.util.Scanner;

public class Employ {
    //properties
    private final int pin = 3792;
    private String name = "Dhruv";
    private int id;
    private double salary;

    //getters: locker lene aayega
    public String getName() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the PIN: ");
        int userPin = sc.nextInt();
        if(userPin == pin) {
            System.out.println("Validation is successfully!");
            return "Welcome back, " + name;
        } else {
            System.out.println("Invalid PIN!");
            return null;
        }
    }

    public int getId() {
        //validation
        return id;
    }
    public double getSalary() {
        //validation
        return salary;
    }

    //setters: locker mein rakhne jayega
    public void setName(String name){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the PIN: ");
        int u_pin = input.nextInt();
        if(u_pin == pin){
            System.out.println("Validation is successfull!");
            this.name = name;
        } else {
            System.out.println("Invalid PIN! Name is NOT Set!");
        }
    }
    public void setID(int id){
        this.id = id;
    }
    public void setSalary(double salary){
        this.salary = salary;
    }
}