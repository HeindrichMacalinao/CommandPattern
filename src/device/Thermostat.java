package device;

public class Thermostat {
    private int temperature = 20;

    public String increaseTemperature() {
        temperature += 1;
        return "Temperature increased to " + temperature + "°C";
    }

    public String decreaseTemperature() {
        temperature -= 1;
        return "Temperature decreased to " + temperature + "°C";
    }
}
