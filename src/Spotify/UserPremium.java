package Spotify;

public class UserPremium extends User {


    public UserPremium () {
        super (hasAds, canDownload);
        this.hasAds = false;
        this.canDownload = true;
    }

    //Getters
    public boolean gethasAds() {
        return hasAds;
    }

    public boolean getcanDownload() {
        return canDownload;
    }

}
