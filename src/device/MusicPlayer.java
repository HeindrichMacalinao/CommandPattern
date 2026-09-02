package device;

public class MusicPlayer {
    private String currentSong;

    public String play() {
        currentSong = "First Love by Hikaru Utada";
        return "Music Playing: " + currentSong;
    }

    public String pause() {
        return "Music Paused.";
    }
}
