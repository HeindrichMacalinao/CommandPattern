package command;

import device.*;

public class PlayMusic implements Command {
    private MusicPlayer musicPlayer;

    public PlayMusic(MusicPlayer musicPlayer) {
        this.musicPlayer = musicPlayer;
    }

    @Override
    public String execute() {
        return musicPlayer.play();
    }
}
