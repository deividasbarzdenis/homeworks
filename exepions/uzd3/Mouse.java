package exepions.uzd3;

public class Mouse extends Device{
    @Override
    public String toString() {
        return "Device Mouse "+ super.toString();
    }

    public Mouse(boolean isOn) {
        super(isOn);
    }
}
