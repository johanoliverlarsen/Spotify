package Spotify;

    public class User {
        protected boolean hasAds;
        protected boolean canDownload;

        //constructor
        public User(boolean hasAds, boolean canDownload) {
            this.hasAds = hasAds;
            this.canDownload = canDownload;
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
            return "Has ads: " + hasAds ", can download: " + canDownload;
        }


    }



