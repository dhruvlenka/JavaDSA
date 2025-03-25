package Projects.MusicPlatform;

public class Song {
    private String title;
    private Singer singer;
    private int duration;

    //parameterized constructor
    Song(String title, Singer singer, int duration){
        this.title = title;
        this.singer = singer;
        this.duration = duration;
    }

    //encapsulation: getter and setter method
    public String getTitle() {
        return title;
    }

    public Singer getSinger() {
        return singer;
    }

    public int getDuration() {
        return duration;
    }

    @Override
    public String toString(){
        return title + " by " + singer.getName() + " (" + duration + "s)";
    }
}
