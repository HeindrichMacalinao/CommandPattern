package command;

import device.*;

public class DecreaseMusicVolume implements Command {
    private MusicPlayer musicPlayer;

    public DecreaseMusicVolume(MusicPlayer musicPlayer) {
        this.musicPlayer = musicPlayer;
    }

    @Override
    public String execute() {
        return musicPlayer.decreaseMusicVolume();
    }
}
