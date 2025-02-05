package Array;

import java.sql.SQLOutput;

public class Array {
    public static void main(String[] args) {
        System.out.println("Day 1 of DSA");
        //Student
        int[] roll = {45,18,24,7};
        String[] studentName = {"Dhruv","Ayush","Harshit","Aman"};
        System.out.println("Students Data");
        System.out.println("Roll    Name");
        System.out.println(roll[0] + "      " + studentName[0]);
        System.out.println(roll[1] + "      " + studentName[1]);
        System.out.println(roll[2] + "      " + studentName[2]);
        System.out.println(roll[3] + "      " + studentName[3]);

        //For Loop
        for(int i=0; i<= roll.length-1; i++){
            System.out.println(roll[i]);
        }
       //Enhanced Loop
            for (int i : roll) {
                System.out.println(i);
            }
        for(String j: studentName){
            System.out.println(j);
        }

        char[] ch = new char[5];
        ch[0] = 'D';
        ch[1] = 'h';
        ch[2] = 'r';
        ch[3] = 'u';
        ch[4] = 'v';
        for(char c: ch){
            System.out.println(c);
        }

        //String to char
        String str = "Macbook Air";
        char[] ch2 = str.toCharArray();
        for(char c: ch2){
            System.out.println(c);
        }

        String d = "Dhruv";
        char[] chD = d.toCharArray();
        for(char c: chD){
            System.out.println(c);
        }
        System.out.println();

    }
}
