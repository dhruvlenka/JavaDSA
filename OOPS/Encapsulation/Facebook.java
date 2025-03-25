package OOPS.Encapsulation;

import java.util.Scanner;

public class Facebook {
    private long mob = 880000;
    private String email = "abc@gmail.com";
    private String pass = "abc@2024";
    private String userName = "abc1111";
    private String homeTown = "ali baba ka ghar";
    private String profile = "bakchod engineer";

    private String p;
    //getter: getting the data
    public long getMob(){
        return mob;
    }
    public String getEmail() {
        return email;
    }
    public String getUserName(){
        return userName;
    }
    public String getHomeTown() {
        return homeTown;
    }
    public String getProfile(){
        return profile;
    }

    //setter: setting the data
    public void setMob(int mob){
        this.mob = mob;
    }
    public void setEmail(String email) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Facebook");
        System.out.println("Is your email is registered? it's help us to find you fastly, reply with yes/YES");
        String yN = input.nextLine();

        if (yN.equalsIgnoreCase("yes")) {
            System.out.println("Enter you Email = ");
            String str = input.nextLine();

            if (str.equals(email)) {
                System.out.println("Please enter the password: ");
                String pE = input.nextLine();

                if (pE.equals(pass)) {
                    System.out.println("Login Successful! Welcome.");
                } else {
                    System.out.println("Incorrect Password.");
                }
            } else {
                System.out.println("You are entering the wrong email!");
            }
        } else {
            System.out.println("Is your mobile number is registeted? Please select Yes/yes");
            String yN2 = input.nextLine();
            if (yN2.equalsIgnoreCase("yes")) {
                System.out.println("Enter your mobile number: ");
                long mobInput = input.nextLong();
                input.nextLine(); //for new line
                if (mobInput == mob) {
                    System.out.println("Please enter the password: ");
                     p = input.nextLine();
                    if (p.equals(pass)) {
                        System.out.println("Login Successful! Welcome");
                    } else {
                        System.out.println("Incorrect Password.");
                    }
                } else {
                    System.out.println("You are entering the wrong mobile number!");
                }
            } else {
                System.out.println("No registered email and mob number.");
            }
        }
    }

    public void setPass(String pass){
        this.pass = pass;
    }
    public void setUserName(String userName){
       this.userName = userName;
    }
    public void setHomeTown(String homeTown){
        this.homeTown = homeTown;
    }
    public void setProfile(String profile){
        this.profile = profile;
    }


}
