/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package devices;

/**
 *
 * @author DELL
 */
public abstract class SmartDevice {
    protected String id;
    protected String status;

    public SmartDevice(String id) {
        this.id = id;
        this.status = "off"; // default status
    }

    public String getId() {
        return id;
    }

    public String getStatus() {
        return status;
    }

    public abstract void turnOn();
    public abstract void turnOff();

    // New method to set the status
    public void setStatus(String status) {
        this.status = status;
    }
}
