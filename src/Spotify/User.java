package Spotify;

    //Superclass
    public class User {
        protected boolean hasAds;
        protected boolean canDownload;

        //constructor
        public User() {
//            this.hasAds = false;
//            this.canDownload = false;
        }

        //Getters
        public boolean gethasAds() {
            return hasAds;
        }

        public boolean getcanDownload() {
            return canDownload;
        }

        //Setters
        public boolean sethasAds(){
            return hasAds;
        }

        public boolean setcanDownload() {
            return canDownload;
        }

        @Override
        public String toString() {
            return "Has ads: " + hasAds + ", can download: " + canDownload;
        }


    }



