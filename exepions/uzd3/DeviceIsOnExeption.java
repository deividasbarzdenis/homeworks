package exepions.uzd3;

public class DeviceIsOnExeption extends Exception{
    private String busena;

    public DeviceIsOnExeption(String busena) {
        this.busena = busena;
    }

    public String getBusena() {
        return busena;
    }

    public void setBusena(String busena) {
        this.busena = busena;
    }
}
