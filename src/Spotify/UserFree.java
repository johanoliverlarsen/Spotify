package Spotify;

public class UserFree extends User {

    //Inherited class
    public UserFree () {
//        super (hasAds, canDownload);
        this.hasAds = true;
        this.canDownload = false;
    }

    //Getters
    public boolean gethasAds() {
        return hasAds;
    }

    public boolean getcanDownload() {
        return canDownload;
    }


}
