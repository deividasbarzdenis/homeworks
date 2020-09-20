package exepions.uzd3;

import java.util.List;

public class Monitoring {

    public void pingAllDevices(List<Device> devices) {
        System.out.println("-----Pinging started-----");
        for (Device device:devices){
            try {
                if (device.ping())
                    System.out.println(device.toString()+" is on");
            } catch (DeviceIsOnExeption deviceIsOnExeption) {
                System.out.println(device.toString()+" is off");
            }
        }
        System.out.println("-----Pinging finished----");
        System.out.println();
    }
}
