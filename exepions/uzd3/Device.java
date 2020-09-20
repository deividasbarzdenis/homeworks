package exepions.uzd3;

public class Device {
    private boolean isOn;
    private int id;
    public static int index;

    public Device(boolean isOn) {
        this.isOn = isOn;
        this.id=index++;
    }

    public int getId() {
        return id;
    }

    public boolean isOn() {
        return isOn;
    }

    public void setOn(boolean on) {
        isOn = on;
    }
    public boolean ping() throws DeviceIsOnExeption {
        if (isOn){
            return true;
        }else {
            throw new DeviceIsOnExeption("Irenginis isjungtas");
        }
    }

    @Override
    public String toString() {
        return " with id "+id;
    }
}
/*1. Sukurkite klasę Device . Klasė turi klasės kintamuosius - isOn , kuris reiškia ar įrenginys yra
įjungtas, ir id , kuris yra unikalus įrenginio numeris (nustatomas sukuriant objektą).
2. Sukurkite keletą įrenginių, kurie paveldės Device klasę.
3. Sukurkite exception klasę DeviceIsOffException .
4. Klasėje Device sukurkite metodą 'ping', kuris patikrina ar įrenginys yra įjungtas. Jei įrenginys
išjungtas, turi būti sukelta išimtis 'DeviceIsOffException'.
5. Sukurti klasę Monitoring su metodu
pingAllDevices , kuris priima sąrašą įrenginių ir juos
tikrina kviesdamas ping metodą tikrina ar įrenginys yra įjungtas. Patikrinimo rezultatą
išveda į ekraną.
6. Atskiroje klasėje su main metodu sukurkite keletą įrenginių ir juos monitorinkite. Tada vieną
iš įrenginių išjunkite ir vėl monitorinkite.*/
