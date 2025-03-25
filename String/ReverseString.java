package String;

import java.util.Arrays;

//Using Two Pointers
public class ReverseString {
    public static void main(String[] args) {
        String s = "MOM";
        char[] charArray = s.toCharArray();
        int i = 0;
        int j = charArray.length-1;
        while (i < j) {
            char temp = charArray[i];
            charArray[i] = charArray[j];
            charArray[j] = temp;
            i++;
            j--;
        }

        String res = new String(charArray);
        System.out.println(res);
    }
}
