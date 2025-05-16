package CollectionFramework.List.ArrayList.Methods;

import java.util.ArrayList;

//addall(): it will add multiple values in the list
public class addAllMethod {
    public static void main(String[] args) {
       ArrayList<String> fruits = new ArrayList<>();
       fruits.add("Apple");
       fruits.add("Mango");
       fruits.add("Orange");
       fruits.add("Banana");
       System.out.println(fruits);

        //new Array List
        ArrayList<String> moreFruits = new ArrayList<>();
        moreFruits.add("Watermelon");
        moreFruits.add("Grapes");

        // Using addAll() method to add moreFruits to fruits
        fruits.addAll(moreFruits);
        System.out.println(fruits);
    }
}
