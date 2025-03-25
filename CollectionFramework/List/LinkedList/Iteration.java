package CollectionFramework.List.LinkedList;

import java.util.LinkedList;

public class Iteration {
    public static void main(String[] args) {
        //Declaration
        LinkedList<String> nolanMovies = new LinkedList<>();
        System.out.println("------Christopher Nolan Movies------");
        //Iteration
        nolanMovies.add("Intersteller");
        nolanMovies.add("Inception");
        nolanMovies.add("Dunkirk");
        nolanMovies.add("Oppenheimer");
        nolanMovies.add("Tenet");
        nolanMovies.add("Batman");
        nolanMovies.add("The Prestige");

        //printing elements of the nolanMovies Linked List
        System.out.println(nolanMovies);

        //Iterating over Linked List using For Loop
        for(int i=0; i<nolanMovies.size(); i++){
            System.out.println(nolanMovies.get(i));
        }

        System.out.println("-------------------------------");
        //Iterating over Linked List using Enhanced For Loop
        for(String s: nolanMovies){
            System.out.println(s);
        }
    }
}
