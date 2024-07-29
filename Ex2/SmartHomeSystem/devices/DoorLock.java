package devices;

/**
 *
 * @author DELL
 */
public class DoorLock extends SmartDevice {
    public DoorLock(String id) {
        super(id);
    }

    @Override
    public void turnOn() {
        status = "locked";
    }

    @Override
    public void turnOff() {
        status = "unlocked";
    }
}
