package CollectionFramework.List.LinkedList;

import java.util.LinkedList;

public class AddingElements {
    public static void main(String[] args) {
        LinkedList<String> nolanMovies = new LinkedList<>();
        System.out.println("------Christopher Nolan Movies------");

        //adding elements using add() method
        nolanMovies.add("Intersteller");
        nolanMovies.add("Inception");
        nolanMovies.add("Dunkirk");
        nolanMovies.add("Oppenheimer");
        nolanMovies.add("Tenet");
        nolanMovies.add("Batman");
        nolanMovies.add("The Prestige");

        System.out.println(nolanMovies);
        System.out.println("Newly Added Movie will show in the bottom of the list.");

        //adding new movies
        nolanMovies.add("The Dark Knight");
        nolanMovies.add("The Dark Knight Rises");
        System.out.println(nolanMovies);

    }
}
