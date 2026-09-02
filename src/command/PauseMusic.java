package command;

import device.*;

public class PauseMusic implements Command {
    private MusicPlayer musicPlayer;

    public PauseMusic(MusicPlayer musicPlayer) {
        this.musicPlayer = musicPlayer;
    }

    @Override
    public String execute() {
        return musicPlayer.pause();
    }
}
