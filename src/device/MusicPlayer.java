package device;

public class MusicPlayer {
    private String currentSong;
    private int volume = 50;

    public String play() {
        currentSong = "First Love by Hikaru Utada";
        return "Music Playing: " + currentSong;
    }

    public String pause() {
        return "Music Paused.";
    }

    public String increaseMusicVolume() {
        volume += 1;
        return "Volume increased to " + volume;
    }

    public String decreaseMusicVolume() {
        volume -= 1;
        return "Volume decreased to " + volume;
    }
}
