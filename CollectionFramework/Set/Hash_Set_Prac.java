package CollectionFramework.Set;

import java.util.HashSet;

public class Hash_Set_Prac {
    public static void main(String[] args) {
        //Creating HashSet
        HashSet<String> marvelMovies = new HashSet<>();
        //adding elements
        marvelMovies.add("The Avengers");
        marvelMovies.add("Iron Man");
        marvelMovies.add("Thor");
        marvelMovies.add("Hulk");
        marvelMovies.add("Captain America");
        marvelMovies.add("Captain America Winter Soldier");
        marvelMovies.add("Thor");
        System.out.println("Display Elements: " + marvelMovies);

        //Iteration
        for(String s: marvelMovies){
            System.out.println(s);
        }

        //contains() method
        System.out.println("Contains: " + marvelMovies.contains("Thor"));

        //isEmpty() method
        System.out.println("Is Empty? " + marvelMovies.isEmpty());

        //size() method
        System.out.println("Size: " + marvelMovies.size());
    }
}
