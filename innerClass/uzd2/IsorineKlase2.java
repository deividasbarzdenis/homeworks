package innerClass.uzd2;

public class IsorineKlase2 {
    private String pavadinimas;
    protected String nr;
    int sk;

    public IsorineKlase2(String pavadinimas, String nr, int sk) {
        this.pavadinimas = pavadinimas;
        this.nr = nr;
        this.sk = sk;
    }

    public static class VidineKlase2 {
        int sk;
        void spausdink(){
            System.out.println("Vidine klase 2");
        }
    }
}
