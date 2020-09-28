package exepions.uzd3;

public class Display extends Device{
    public Display(boolean isOn) {
        super(isOn);
    }

    @Override
    public String toString() {
        return "Device Display "+super.toString();
    }
}
