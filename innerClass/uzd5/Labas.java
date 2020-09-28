package innerClass.uzd5;

public class Labas {
    private int sk = 10;
    private String zodis = "zodis";

    public  IDiena labaDiena() {
     class Diena implements IDiena{
         @Override
         public void diena(){
             System.out.println("diena, "+zodis);
         }
     }
     Diena d = new Diena();
     return d;
    }

    public static void main(String[] args) {
        Labas diena = new Labas();
        IDiena iDiena = diena.labaDiena();
        iDiena.diena();
    }
}
