package command;

import device.*;

public class IncreaseTemperature implements Command {
    private Thermostat thermostat;

    public IncreaseTemperature(Thermostat thermostat) {
        this.thermostat = thermostat;
    }

    @Override
    public String execute() {
        return thermostat.increaseTemperature();
    }
}
