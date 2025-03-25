package Recursion;

import java.util.Arrays;

public class Recursion_StringReverse {

    //Swapping using String Builder
    static void swap(StringBuilder str, int i, int j ){
        char temp = str.charAt(i);
        str.setCharAt(i, str.charAt(j));
        str.setCharAt(j, temp);
    }
    /*
    Why we used: String Builder?
    In Java, strings are immutable, meaning their contents
    cannot be changed once they are created. Therefore,
    you cannot directly swap characters within a String
    object without creating a new String. However, you can
    use other approaches, such as converting the string
    to a character array, swapping the characters, and
    then creating a new string from the modified array.
     */

    //Swapping using char and Array
    static String swap(String str, int i, int j){
        char[] charArray = str.toCharArray();
        char temp = charArray[i];
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return new String(charArray);
    }

    static String reverseString(String str, int i, int j){
        if(i > j){
            return str;
        }
        str = swap(str, i, j);
        return reverseString(str, i+1, j-1);
    }
    static void reverseString2(StringBuilder str, int i, int j){
   //     System.out.println("Call received for: " + str);
        //Base Case
        if(i > j){
            return;
        }
        swap(str, i, j);

        reverseString2(str, i+1, j-1);
    }

    public static void main(String[] args) {
        String movie = "54321";
        System.out.println("Original String: " + movie);
        String rev = reverseString(movie, 0, movie.length()-1);
        System.out.println("Reversed using Array " + rev);

        System.out.println();

        StringBuilder sb = new StringBuilder("Dhruv");
        int i2 = 0;
        int j2 = sb.length()-1;

        System.out.println("Original String: " + sb);
        reverseString2(sb, i2, j2);
        System.out.println("Reversed using StringBuilder: " + sb.toString());
    }
}
