package command;

import device.*;

public class TurnOffLight implements Command {
    private Light light;

    public TurnOffLight(Light light) {
        this.light = light;
    }

    @Override
    public String execute() {
        return light.turnOff();
    }
}
