/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hub;

import devices.SmartDevice;
import factory.DeviceFactory;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class SmartHomeHub {
    private List<SmartDevice> devices;
    private Scheduler scheduler;
    private List<Trigger> triggers;

    public SmartHomeHub() {
        devices = new ArrayList<>();
        scheduler = new Scheduler();
        triggers = new ArrayList<>();
    }

    public void addDevice(String type, String id, String status) {
        SmartDevice device = DeviceFactory.createDevice(type, id);
        if (device != null) {
            device.setStatus(status); // Set the initial status
            devices.add(device);
            System.out.println(type + " with ID " + id + " added with status: " + status);
        } else {
            System.out.println("Invalid device type: " + type);
        }
    }

    public void removeDevice(String id) {
        devices.removeIf(device -> device.getId().equals(id));
        System.out.println("Device with ID " + id + " removed.");
    }

    public void turnOnDevice(String id) {
        for (SmartDevice device : devices) {
            if (device.getId().equals(id)) {
                device.turnOn();
                break;
            }
        }
    }

    public void turnOffDevice(String id) {
        for (SmartDevice device : devices) {
            if (device.getId().equals(id)) {
                device.turnOff();
                break;
            }
        }
    }

    public void scheduleDevice(String id, String time, String action) {
        try {
            LocalTime scheduleTime = LocalTime.parse(time);
            Runnable task = () -> {
                if (action.equalsIgnoreCase("Turn On")) {
                    turnOnDevice(id);
                } else if (action.equalsIgnoreCase("Turn Off")) {
                    turnOffDevice(id);
                }
            };
            scheduler.scheduleTask(scheduleTime, task);
            System.out.println("Scheduled " + action + " for device " + id + " at " + time);
        } catch (Exception e) {
            System.out.println("Error scheduling device: " + e.getMessage());
        }
    }

    public void addTrigger(String condition, Runnable action) {
        triggers.add(new Trigger(condition, action));
    }

    public void checkTriggers() {
        for (SmartDevice device : devices) {
            for (Trigger trigger : triggers) {
                trigger.checkCondition(device);
            }
        }
    }

    public void printStatus() {
        for (SmartDevice device : devices) {
            System.out.println(device.getStatus());
        }
        System.out.println("Scheduled Tasks: " + scheduler.getSchedule());
    }

    public static void main(String[] args) {
        SmartHomeHub hub = new SmartHomeHub();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Smart Home System Initialized. Enter commands to control the devices.");
        System.out.println("Commands: addDevice(type, id, status), removeDevice(id), turnOn(id), turnOff(id), setSchedule(id, time, action), addTrigger(condition, action), status, exit");

        while (true) {
            System.out.print("Enter command: ");
            String command = scanner.nextLine().trim();
            if (command.equalsIgnoreCase("exit")) {
                break;
            } else if (command.startsWith("addDevice")) {
                String[] parts = command.split("\\(")[1].split("\\)")[0].split(", ");
                if (parts.length == 3) {
                    hub.addDevice(parts[0], parts[1], parts[2]);
                } else {
                    System.out.println("Invalid command format. Expected: addDevice(type, id, status)");
                }
            } else if (command.startsWith("removeDevice")) {
                String id = command.split("\\(")[1].split("\\)")[0];
                hub.removeDevice(id);
            } else if (command.startsWith("turnOn")) {
                String id = command.split("\\(")[1].split("\\)")[0];
                hub.turnOnDevice(id);
            } else if (command.startsWith("turnOff")) {
                String id = command.split("\\(")[1].split("\\)")[0];
                hub.turnOffDevice(id);
            } else if (command.startsWith("setSchedule")) {
                String[] parts = command.split("\\(")[1].split("\\)")[0].split(", ");
                if (parts.length == 3) {
                    hub.scheduleDevice(parts[0], parts[1].replaceAll("\"", ""), parts[2]);
                } else {
                    System.out.println("Invalid command format. Expected: setSchedule(id, time, action)");
                }
            } else if (command.startsWith("addTrigger")) {
                String[] parts = command.split("\\(")[1].split("\\)")[0].split(", ");
                if (parts.length == 2) {
                    hub.addTrigger(parts[0], () -> hub.turnOffDevice(parts[1]));
                } else {
                    System.out.println("Invalid command format. Expected: addTrigger(condition, action)");
                }
            } else if (command.equalsIgnoreCase("status")) {
                hub.printStatus();
            } else {
                System.out.println("Unknown command: " + command);
            }
            hub.checkTriggers();
        }
        scanner.close();
    }
}
