package app;

import command.*;
import device.*;
import invoker.RemoteControl;

public class ViewerApp {
    public static void main(String[] args) {
        // Initialize devices
        TV tv = new TV();
        Light light = new Light();
        Thermostat thermostat = new Thermostat();
        MusicPlayer musicPlayer = new MusicPlayer();

        RemoteControl rc = new RemoteControl();

        System.out.println("おかえりなさい! Welcome Home! ♡");

        // Commands for TV
        rc.setCommand(new PowerOnTV(tv));
        System.out.println(rc.clickButton());

        rc.setCommand(new PowerOffTV(tv));
        System.out.println(rc.clickButton());

        // Commands for Light
        rc.setCommand(new TurnOffLight(light));
        System.out.println(rc.clickButton());

        rc.setCommand(new TurnOnLight(light));
        System.out.println(rc.clickButton());

        rc.setCommand(new IncreaseLightBrightness(light));
        System.out.println(rc.clickButton());

        rc.setCommand(new DecreaseLightBrightness(light));
        System.out.println(rc.clickButton());

        // Commands for Thermostat
        rc.setCommand(new DecreaseTemperature(thermostat));
        System.out.println(rc.clickButton());

        rc.setCommand(new IncreaseTemperature(thermostat));
        System.out.println(rc.clickButton());

        // Commands for Music Player
        rc.setCommand(new PlayMusic(musicPlayer));
        System.out.println(rc.clickButton());

        rc.setCommand(new PauseMusic(musicPlayer));
        System.out.println(rc.clickButton());
    }
}