package innerClass.uzd6;

public class Labas {
    private int sk = 10;
    private String zodis = "zodis";

    public IDiena labaDiena() {
        IDiena id = new IDiena() {
            @Override
            public IDiena diena() {
                System.out.println("diena "+zodis);
                return null;
            }
        };
        return id.diena();
    }

    public static void main(String[] args) {
        Labas diena = new Labas();
        IDiena iDiena = diena.labaDiena();
        iDiena.diena();
    }
}
