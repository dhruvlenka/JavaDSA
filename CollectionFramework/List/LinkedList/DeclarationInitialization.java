package CollectionFramework.List.LinkedList;

import java.util.LinkedList;
public class DeclarationInitialization {
    public static void main(String[] args) {
        LinkedList<String> nolanMovies = new LinkedList<>();
        System.out.println("------Christopher Nolan Movies------");
        nolanMovies.add("Intersteller");
        nolanMovies.add("Inception");
        nolanMovies.add("Dunkirk");
        nolanMovies.add("Oppenheimer");
        nolanMovies.add("Tenet");
        nolanMovies.add("Batman");
        nolanMovies.add("The Prestige");

        //printing elements of the nolanMovies Linked List
        System.out.println(nolanMovies);

     }
}
