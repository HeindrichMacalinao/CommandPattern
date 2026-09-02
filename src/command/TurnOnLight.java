package command;

import device.*;

public class TurnOnLight implements Command {
    private Light light;

    public TurnOnLight(Light light) {
        this.light = light;
    }

    @Override
    public String execute() {
        return light.turnOn();
    }
}
