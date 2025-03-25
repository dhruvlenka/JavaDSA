package OOPS.Encapsulation;

public class FacebookDriver {
    public static void main(String[] args) {
        Facebook face = new Facebook();
        face.setEmail("abc@gmail.com");
        face.setPass("abc@2024");
        System.out.println("----------------------");
        System.out.println("Username: " + face.getUserName());
        System.out.println("Mobile: " +face.getMob());
        System.out.println("Hometown: "+ face.getHomeTown());
        System.out.println("Job Profile: " + face.getProfile());
    }
}
