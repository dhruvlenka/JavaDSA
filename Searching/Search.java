package Searching;

import java.util.ArrayList;
import java.util.Scanner;

public class Search {
    public static void main(String[] args) {
        //Searching in Array
        int[] array = {15,20,10,5,25};
        for(int i=0; i<array.length; i++){
           if (array[i] == 10){
               System.out.println("Element is Available!");
           }
        }

        //Searching in ArrayList
        ArrayList<String> names = new ArrayList<>();
        names.add("Dhruv");
        names.add("Deepak");
        names.add("Daranath");
        for(int i=0; i<names.size(); i++){
            if (names.get(i) == "Dhruv"){
                System.out.println("Yes He is in the passenger list.");
            }
        }

        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Orange");
        fruits.add("Banana");
        fruits.add("Apple");
        fruits.add("Pineapple");
        System.out.println(fruits);
        boolean isFruitsAvailable = false;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter Fruit Name: ");
        String fruit = input.nextLine();

        for(String s: fruits){
            if (s.equals(fruit)){
                isFruitsAvailable = true;
            }
        }
        if (isFruitsAvailable){
            System.out.println("Fruit Available");
        } else {
            System.out.println("Fruit Not Available");
        }
    }
}
