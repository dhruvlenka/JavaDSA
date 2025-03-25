package OOPS.Encapsulation;

import java.util.Scanner;

public class Laptop {
    private int password = 123456;
    private String name = "King";
    private String email;

    //getter
    public int getPassword(){
        return password;
    }
    public String getName() {
        return name;
    }
    public  String getEmail() {
        return email;
    }

    //setter
    public void setPassword(int password){
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome " + name);
        System.out.println("Enter the Password: ");
        int pass = input.nextInt();
        if(pass == password){
            System.out.println("Login Successful, Welcome back!");
        } else {
            System.out.println("Incorrect Password!");
        }
    }
    public void setName(String name){
        this.name = name;
    }
    public void setEmail(String email){
        this.email = email;
    }
}
