package factory;

import devices.Light;
import devices.Thermostat;
import devices.DoorLock; 
import devices.SmartDevice;
/**
 *
 * @author DELL
 */
public class DeviceFactory {
    public static SmartDevice createDevice(String type, String id) {
        switch (type.toLowerCase()) {
            case "light":
                return new Light(id);
            case "thermostat":
                return new Thermostat(id);
            case "door":
                return new DoorLock(id); // Ensure DoorLock is correctly returned
            default:
                throw new IllegalArgumentException("Unknown device type");
        }
    }
}
