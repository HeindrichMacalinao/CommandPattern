package command;

import device.*;

public class DecreaseTemperature implements Command {
    private Thermostat thermostat;

    public DecreaseTemperature(Thermostat thermostat) {
        this.thermostat = thermostat;
    }

    @Override
    public String execute() {
        return thermostat.decreaseTemperature();
    }
}
