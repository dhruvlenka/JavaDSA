package Projects.MusicPlatform;

public class Singer {
    private String name;
    private int singerId;
    private String genre;

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
