import java.util.Scanner;

public class ValidPalindrom2 {
    public static void main(String[] args) {
        //Two Pointer Approach
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a String = ");
        String str = input.nextLine();
        str = str.toLowerCase();
        str = str.replaceAll("[^a-zA-Z0-9]", "");
        int start = 0;
        int end = str.length()-1;
        while(start<end){
            if (str.charAt(start) != str.charAt(end)){
                System.out.println(false);
            } else {
                start++;
                end--;
            }
        }
        System.out.println(true);
    }
}
