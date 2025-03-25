//LeetCode: 2299
public class StrongPasswordCheckerII {
    public static void main(String[] args) {
        String password = "IloveLe3tcode@#";
        //checking password length
        if (password.length() < 8){
            System.out.println(false);
        }

//        ArrayList<Character> arr = new ArrayList<>();
//        //putting string into a array list in the form of characters
//        for (int i = 0; i<password.length(); i++){
//            arr.add(password.charAt(i));
//        }
//        System.out.println(arr);

        boolean lower = false;
        boolean upper = false;
        boolean digit = false;
        String symbols = "!@#$%^&*()-+";
        boolean sym = false;
        char prev = '.';

        for (int i=0; i<password.length(); i++){
            char currChar = password.charAt(i);
            if(currChar == prev){
                System.out.println(false);
            }
            prev = currChar;
            if (currChar >= 'a' && currChar <= 'z'){
                lower = true;
            } else if (currChar >= 'A' && currChar <= 'Z'){
                upper = true;
            } else if (currChar >= '0' && currChar <= '9'){
                digit = true;
            } else if (symbols.contains(Character.toString(currChar))){
                sym = true;
            }
        }
        System.out.println(lower && upper && digit && sym);
    }
}
/*
symbols.contains(Character.toString(currentChar)) is checking whether the symbols string contains the currentChar character.

In this code, symbols is a string that contains all the special characters that we want to allow in the password. Character.toString(currentChar) converts the current character being examined to a string, so that we can use the contains() method of the String class to check if the symbols string contains that character.

For example, if the current character is @, then Character.toString(currentChar) will return the string "@". Then symbols.contains(Character.toString(currentChar)) will check if the symbols string contains the "@" string, which it does, so sym is set to true.
 */