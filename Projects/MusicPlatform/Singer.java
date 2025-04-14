package Projects.MusicPlatform;

public class Singer {
    private final String name;
    private final int singerId;
    private final String genre;

    //parameterized constructor
    Singer(String name, int singerId, String genre){
        this.name = name;
        this.singerId = singerId;
        this.genre = genre;
    }

    //encapsulations: getter and setter method
    public String getName() {
        return name;
    }

    public int getSingerId() {
        return singerId;
    }

    public String getGenre() {
        return genre;
    }
}
