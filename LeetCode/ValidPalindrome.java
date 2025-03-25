import java.util.Scanner;
public class ValidPalindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a String = ");
        String str = input.nextLine();
        System.out.println(str);
        String reverse = "";
        if (str.isEmpty()) {
            System.out.println(true);
        }
        for(int i=str.length()-1; i>=0; i--){
            reverse = reverse + str.charAt(i);
        }
        System.out.println(reverse);
        //Character.isCharacter
        if (str.equals(reverse)){
            System.out.println(true);
        } else {
            System.out.println(false);
        }

    }
}
