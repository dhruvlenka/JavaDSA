package CollectionFramework.List.ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListInput2 {
    public static void main(String[] args) {
        //input
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Your Marks = ");
        //Making ArrayList
        ArrayList<Integer> marks = new ArrayList<>();
        //Loop for taking input of 5 integer values
        for (int i=0; i<5; i++){
            marks.add(input.nextInt());

        }

        System.out.println(marks);
    }
}
