package exepions.uzd3;

public class Keyboard extends Device{
    public Keyboard(boolean isOn) {
        super(isOn);
    }

    @Override
    public String toString() {
        return "Device Keyboard"+super.toString();
    }
}
