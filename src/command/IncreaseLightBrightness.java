package command;

import device.*;

public class IncreaseLightBrightness implements Command {
    private Light light;

    public IncreaseLightBrightness(Light light) {
        this.light = light;
    }

    @Override
    public String execute() {
        return light.increaseBrightness();
    }
}
