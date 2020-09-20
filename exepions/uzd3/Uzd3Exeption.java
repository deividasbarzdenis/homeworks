package exepions.uzd3;

import java.util.ArrayList;
import java.util.List;

public class Uzd3Exeption {
    public static void main(String[] args) throws DeviceIsOnExeption {
        Monitoring monitoring = new Monitoring();
        List<Device> devices = new ArrayList<>();
        devices.add(new Mouse(true));
        devices.add(new Display(true));
        devices.add(new Keyboard(true));
        devices.add(new Mouse(true));
        devices.add(new Display(true));
        devices.add(new Keyboard(true));
        monitoring.pingAllDevices(devices);
        devices.get(3).setOn(false);
        monitoring.pingAllDevices(devices);
    }
}
