package command;

import device.TV;

public class PowerOffTV implements Command {
    private TV tv;

    public PowerOffTV(TV tv) {
        this.tv = tv;
    }

    @Override
    public String execute() {
        return tv.switchOff();
    }
}