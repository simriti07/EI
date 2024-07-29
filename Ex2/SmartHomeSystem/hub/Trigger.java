/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hub;

import devices.SmartDevice;
import devices.Thermostat;
/**
 *
 * @author DELL
 */
public class Trigger {
    private String condition;
    private Runnable action;

    public Trigger(String condition, Runnable action) {
        this.condition = condition;
        this.action = action;
    }

    public void checkCondition(SmartDevice device) {
        if (condition.equals("temperature > 75") && device instanceof Thermostat) {
            Thermostat thermostat = (Thermostat) device;
            if (thermostat.getTemperature() > 75) {
                action.run();
            }
        }
    }
}
