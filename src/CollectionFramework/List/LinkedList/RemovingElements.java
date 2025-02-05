package CollectionFramework.List.LinkedList;

import java.util.LinkedList;

public class RemovingElements {
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
        nolanMovies.add("Avatar");

        System.out.println(nolanMovies);
        if (nolanMovies.contains("Avatar")){
            System.out.println("Sorry Avatar is not made by Christopher Nolan, I am removing this.");
            nolanMovies.remove("Avatar");
        }
        System.out.print("Updated Movies List of Christopher Nolan: ");
        System.out.print(nolanMovies);


    }
}
