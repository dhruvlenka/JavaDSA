package CollectionFramework.List.LinkedList;

import java.util.LinkedList;

public class AccessingElements {
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

        //accessing the elements using get() method
        System.out.println(nolanMovies.get(3));
    }
}
