package innerClass.uzd2;

public class Uzd2InnerClass {
    private static IsorineKlase2 is;
    private static IsorineKlase2.VidineKlase2 vid;

    public static void main(String[] args) {
        IsorineKlase2 is = new IsorineKlase2("Labas", "treciadienis1", 123);
        IsorineKlase2.VidineKlase2 vid = new IsorineKlase2.VidineKlase2();
        vid.spausdink();
    }
}
