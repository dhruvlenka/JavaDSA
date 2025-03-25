package Projects.MusicPlatform;

public enum UserType {
    //defines the three user types with their playlist limits
    FREE(5), PREMIUM(100), VIP(Integer.MAX_VALUE);

    private final int maxPlaylists;

    UserType(int maxPlaylists){
        this.maxPlaylists = maxPlaylists;
    }

    public int getMaxPlaylists(){
        return maxPlaylists;
    }

}
