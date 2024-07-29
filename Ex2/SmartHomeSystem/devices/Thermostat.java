/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package devices;

/**
 *
 * @author DELL
 */
public class Thermostat extends SmartDevice {
    private int temperature;

    // Constructor with just the ID
    public Thermostat(String id) {
        super(id);
        this.temperature = 70; // Default temperature
        this.status = "set to " + temperature + " degrees";
    }

    // New constructor with ID and initial temperature
    public Thermostat(String id, int initialTemperature) {
        super(id);
        this.temperature = initialTemperature;
        this.status = "set to " + temperature + " degrees";
    }

    @Override
    public void turnOn() {
        status = "on";
    }

    @Override
    public void turnOff() {
        status = "off";
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
        this.status = "set to " + temperature + " degrees";
    }

    public int getTemperature() {
        return temperature;
    }

    @Override
    public void setStatus(String status) {
        try {
            int temp = Integer.parseInt(status);
            setTemperature(temp);
        } catch (NumberFormatException e) {
            System.out.println("Invalid temperature format: " + status);
        }
    }

    @Override
    public String getStatus() {
        return "Thermostat " + id + " is " + status;
    }
}