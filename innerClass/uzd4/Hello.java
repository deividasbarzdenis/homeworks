package innerClass.uzd4;

public class Hello {
    private int sk = 10;
    private String zodis = "zodis";

    void labaDiena() {
        class Diena {
            void diena() {
                System.out.println("diena, " + sk + ", " + zodis);
            }
        }
        Diena diena = new Diena();
        diena.diena();
    }

    void labasVakaras() {
        class Vakaras {
            void diena() {
                System.out.println("vakaras, " + sk + ", " + zodis);
            }
        }
        Vakaras vakaras = new Vakaras();
        vakaras.diena();
    }

    public static void main(String[] args) {
        Hello hello = new Hello();
        hello.labasVakaras();
        hello.labaDiena();
    }

}
