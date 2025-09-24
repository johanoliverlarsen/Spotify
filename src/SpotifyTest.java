import java.util.ArrayList;

public class SpotifyTest {
    public static void main(String[] args) {

     runSpotify();

    }

    public static void runSpotify() {
        ArrayList<String> songArrayList = new ArrayList<>();
        boolean running = true;
        /*
        public void run(){
            while (running) {
                int choice = chooseOption()
            }
        }

*/
        public static void chooseOption() {
            while (running) {


                System.out.println("\nChoose option:");
                System.out.println("1: Add song");
                System.out.println("2: Remove song");
                System.out.println("3: Show all songs");
                System.out.println("4: Edit song title");
                System.out.println("5: Finish");
                System.out.print("Choose option (1-5): ");


                for (String song : songList) {
                    if (song.contains(findString)) {
                        System.out.println("Song found: " + song);
                    }
                }
    }
}














