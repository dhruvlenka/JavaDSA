package Projects.MusicPlatform;

import java.util.ArrayList;
import java.util.List;

 class User {
     private final String username;
     private final UserType userType;
     private final List<Playlist> playlists;

     //parameterized construvtor
     public User(String username, UserType userType) {
         this.username = username;
         this.userType = userType;
         this.playlists = new ArrayList<>();
     }

     //it will check a user can make a playlist or not, becauser it's in limit
     public boolean canCreatePlaylist() {
         return playlists.size() < userType.getMaxPlaylists();
     }

     //creating playlist
     public boolean createPlaylist(String playlistName) {
         if (canCreatePlaylist()) {
             playlists.add(new Playlist(playlistName));
             return true;
         }
         System.out.println("Playlist limit reached for " + userType + " user");
         return false;
     }

     //adding a song into the playlist
     public boolean addSongToPlaylist(String playlistName, Song song) {
         Playlist playlist = findPlaylist(playlistName);
         if (playlist != null) {
             playlist.addSongs(song);
             return true;
         }
         System.out.println("Playlist '" + playlistName + "' not found");
         return false;
     }

     //removing song from the playlist
     public boolean removeSongFromPlaylist(String playlistName, Song song) {
         Playlist playlist = findPlaylist(playlistName);
         if (playlist != null) {
             playlist.removeSongs(song);
             return true;
         }
         System.out.println("Playlist '" + playlistName + "' not found");
         return false;
     }

     //find playlists
     private Playlist findPlaylist(String playlistName) {
         for (Playlist playlist : playlists) { // private final List<Playlist> playlists;
             if (playlist.getName().equalsIgnoreCase(playlistName)) {
                 return playlist;
             }
         }
         return null;
     }

     //displaying playlists
     public void displayPlaylists() {
         System.out.println("\nUser: " + username + " (" + userType + ")");
         System.out.println("Playlists: ");
         for (Playlist playlist : playlists) { // private final List<Playlist> playlists;
             System.out.println("- " + playlist.getName() + ":");
             for (Song song : playlist.getSongs()) {
                 System.out.println("  * " + song);
             }
         }
     }
}

public class MusicApplication {
    public static void main(String[] args) {
        //singers
        Singer singer1 = new Singer("The Weekend", 1, "Pop");
        Singer singer2 = new Singer("Travis Scott", 2, "Hip-Hop");
        Singer singer3 = new Singer("Blue", 3, "Folk-Pop");

        //songs
        Song song1 = new Song("After Hours", singer1, 360);
        Song song2 = new Song("Call Out My Name", singer1, 240);
        Song song3 = new Song("Highest In The Room", singer2,180);
        Song song4 = new Song("Goosebumps", singer2,240);
        Song song5 = new Song("Shape of You", singer3, 240);
        Song song6 = new Song("Photograph", singer3, 250);


        //creating different types of users
        User freeUser = new User("Jack", UserType.FREE);
        User premiumUser = new User("Reacher", UserType.PREMIUM);
        User vipUser = new User("Stark", UserType.VIP);

        //test Free User
        freeUser.createPlaylist("Workout");
        freeUser.createPlaylist("Romance");
        freeUser.addSongToPlaylist("Workout", song3);
        freeUser.addSongToPlaylist("Romance", song5);

        //test premium user
        premiumUser.createPlaylist("The Weekend");
        premiumUser.addSongToPlaylist("The Weekend", song2);

        //test vip user
        vipUser.createPlaylist("My Favs");
        vipUser.addSongToPlaylist("My Favs", song1);
        vipUser.addSongToPlaylist("My Favs", song2);
        vipUser.addSongToPlaylist("My Favs", song4);
        vipUser.addSongToPlaylist("My Favs", song6);

        //displaying all user's playlists
        freeUser.displayPlaylists();
        premiumUser.displayPlaylists();
        vipUser.displayPlaylists();

        System.out.println();
        //removing a song from the playlists
        freeUser.removeSongFromPlaylist("Workout", song3);
        System.out.println("After removing song from user's Pop Hits: ");
        freeUser.displayPlaylists();

    }
}
