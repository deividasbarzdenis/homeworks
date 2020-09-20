package exepions.uzd1;

public class A {
    private static B b= new B();

    public static void main(String[] args) {
        try {
            b.metodas();
        }catch (Klaida e){
            System.out.println("KLAIDA");
        }
    }

}
