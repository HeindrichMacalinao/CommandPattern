package command;

import device.*;

public class DecreaseLightBrightness implements Command {
    private Light light;

    public DecreaseLightBrightness(Light light) {
        this.light = light;
    }

    @Override
    public String execute() {
        return light.decreaseBrightness();
    }
}
