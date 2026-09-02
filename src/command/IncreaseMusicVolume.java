package command;

import device.*;

public class IncreaseMusicVolume implements Command {
    private MusicPlayer musicPlayer;

    public IncreaseMusicVolume(MusicPlayer musicPlayer) {
        this.musicPlayer = musicPlayer;
    }

    @Override
    public String execute() {
        return musicPlayer.increaseMusicVolume();
    }
}
