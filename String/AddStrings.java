package String;

import java.util.ArrayList;

public class AddStrings {
    public static void main(String[] args) {
        String num1 = "5";
        String num2 = "21";

        //value of method
        int element1 = Integer.valueOf(num1);
        int element2 = Integer.valueOf(num2);
        int sum = element1 + element2;
        System.out.println(sum);

        //parse Int method
        int ele1 = Integer.parseInt(num1);
        int ele2 = Integer.parseInt(num2);
        System.out.println(ele1 + ele2);


    }
}
