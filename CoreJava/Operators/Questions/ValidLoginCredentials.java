package CoreJava.Operators.Questions;

public class ValidLoginCredentials {
    public static void main(String[] args) {
        String email = "abc@gmail.com";
        long number = 9898122342l;
        String pass = "abd@123";
        String username = "abcd";

        //AND
        if(email == "abc@gmail.com" && pass == "abd@123"){
            System.out.println("Valid Credentials, Login Successful.");
        } else {
            System.out.println("Wrong Credentials, Login Failed.");
        }

        //OR
        if(username=="abcd" || email=="def@gmail.com" || pass=="abd@123"){
            System.out.println("Valid Credentials, Login Successful.");
        } else {
            System.out.println("Wrong Credentials, Login Failed.");
        }
    }
}
