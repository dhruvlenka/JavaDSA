package CollectionFramework.List.LinkedList;

import java.util.LinkedList;

public class ElementsAtSpecificPosition {
    public static void main(String[] args) {
        LinkedList<String> nolanMovies = new LinkedList<>();
        nolanMovies.add("Intersteller");
        nolanMovies.add("Inception");
        nolanMovies.add("Dunkirk");
        nolanMovies.add("Tenet");
        nolanMovies.add("Batman");
        nolanMovies.add("The Prestige");

        //adding the elements at the first position
        System.out.println("------Adding at First Position--------");
        nolanMovies.addFirst("Following");
        System.out.println(nolanMovies);

        System.out.println("------Adding at Last Position-------");
        //adding the elements at the last position
        nolanMovies.addLast("Oppenheimer");
        System.out.println(nolanMovies);

        System.out.println("------Adding the element at Specified Position-------");
        //adding the element at speicifed position
        nolanMovies.add(6,"The Dark Knight");
        nolanMovies.add(7, "The Dark Knigh Rises");
        System.out.println(nolanMovies);

    }
}
