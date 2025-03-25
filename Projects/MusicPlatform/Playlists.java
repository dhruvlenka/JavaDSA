package Projects.MusicPlatform;

import java.util.ArrayList;
import java.util.List;

public class Playlists {
    private String name;
    private List<Song> songs;

    //paraemeteroized constructor
    Playlists(String name){
        this.name = name;
        this.songs = new ArrayList<>();
    }

    //getter and setter methods
    public String getName() {
        return name;
    }
    public List<Song> getSongs() {
        return songs;
    }

    //adding song in the playlist
    public void addSongs(Song song){
        songs.add(song);
    }
    //removing song from the playlist
    public void removeSongs(Song song){
        songs.remove(song);
    }
}
