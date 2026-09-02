package command;

import device.TV;

public class PowerOnTV implements Command {
    private TV tv;

    public PowerOnTV(TV tv) {
        this.tv = tv;
    }

    @Override
    public String execute() {
        return tv.switchOn();
    }
}