package Projects.MusicPlatform;

import java.util.List;

public class User {
    private String username;
    private UserType userType;
    private List<Playlists> playlists;

    //parameterized constructor
    User(String username, UserType userType, List<Playlists> playlists){
        this.username = username;
        this.userType = userType;
        this.playlists = playlists;
    }

    //user's type playlist creation
    public boolean canCreatePlaylist(){
        return playlists.size() < userType.getMaxPlaylists();
    }
    public static void main(String[] args) {

    }
}
