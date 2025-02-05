package String;

import java.util.Scanner;

public class LengthProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String s = input.nextLine();

        //1st way: by using method toCharArray();
        char[] ch = s.toCharArray();
        System.out.println("Length is: " + ch.length);

        System.out.println();

        //2nd way: by using bytes
        byte[] byteArray = s.getBytes();
        for(byte b: byteArray){
            System.out.println(b);
        }

        int length = byteArray.length;

        System.out.println("Length of the string: " + length);


        System.out.println();

        //3rd way: using IndexOutOfBoundException
        //we can get the length of the string by running an infinite for loop and by using try catch block.
        int lengthh = 0;
        try {
            while (true){
                s.charAt(lengthh);
                lengthh++;
            }
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Length of the string: " + length);
        }

        //using split method
        String[] split = s.split("");
        int lengthhh = split.length;
        System.out.println("Length of the string using split : "+ lengthhh);

        System.out.println("===== " + getLength5(s));


    }

    public static int getLength4(String s){
        s = s + '0';
        int length = 0;
        for(int i=0;; i++){
            if(s.charAt(i) == '0'){
                return length;
            }
            length++;
        }
    }

    public static int getLength5(String s){
       return s.split("").length;
    }

    public static void evenLengthWords(String s){
        String word = "";
        int count = 0;
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if(c != ' '){
                word = word + c;
                if(word.length() %2 == 0){
                    System.out.println(word);
                    count++;
                }
                word = "";
            }
        }
        System.out.println("Total Such Words are: " + count);
    }
}
