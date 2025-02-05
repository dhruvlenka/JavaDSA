package ArrayQuestions;

import java.util.Scanner;

public class StringLargest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size; ");
        int size = input.nextInt(); //buffer issue
        input.nextLine();

        String[] a = new String[size];
        for(int i=0; i<a.length; i++){
            System.out.println("Enter the string " + (i+1) + ": ");
            a[i] = input.nextLine();
        }

        String biggest = getBiggestString(a);
        System.out.println("Biggest " + biggest);

//        String[] str = {"Thor", "IronMan", "Hulk", "Captain America", "Natashaa"};
//        int ans = getBiggest(str);
//        System.out.println(ans);
//
//        String ans2 = getBiggestString(str);
//        System.out.println(ans2);

    }
    public static int getBiggest(String[] arr){
         int biggest = arr[0].length();
        for(int i=0; i<arr.length; i++){
            if(arr[i].length() > biggest){
                biggest = arr[i].length();
            }
        }
        return biggest;
    }
    public static String getBiggestString(String[] str){
        String biggest = "";
        for(int i=0; i<str.length; i++){
            if(str[i].length() > biggest.length()){
                biggest = str[i];
            }
        }
        /*
         for (String s : str) {
            if (s.length() > biggest.length()) {
                biggest = s;
            }
        }
         */
        return biggest;
    }
}
