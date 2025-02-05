package String.Questions;

import java.util.Scanner;

public class SplitLargestWord {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Word: ");
        String word = input.nextLine();
        String largest = getLargestWord(word);
        System.out.println(largest);
    }
    public static String getLargestWord(String s){
        String[] p = s.split("\s+");
        String big = "";
        for(String k: p){
            if(k.length() > big.length()){
                big = k;
            }
        }
        return big;
    }
}
