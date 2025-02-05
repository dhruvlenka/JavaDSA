import java.util.Scanner;

public class StringNumAddition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String temp = "";
        int output = 0;
        for(int i=0; i<input.length();i++){
            if(Character.isDigit(input.charAt(i)))
            {
                if(i<input.length()-1 && Character.isDigit(input.charAt(i+1)))
                {
                    temp += input.charAt(i);
                }
                else
                {
                    temp += input.charAt(i);
                    output += Integer.parseInt(temp);
                    temp = "";
                }
            }
        }
        System.out.println(output);
    }
}
