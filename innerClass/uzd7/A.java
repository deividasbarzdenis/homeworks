package innerClass.uzd7;

public class A {
    private int i=1;


    private int getI() {
        return i;
    }

    class B {
        class C {
            private int k=3;


            private int getK() {
                return k;
            }

            public void s() {
                System.out.println("s metodas" + " i reiksme " + i);
                System.out.println("s metodas" + " getI reiksme " + getI());
                System.out.println("C.k "+k);
                System.out.println("C getK "+getK());

            }

        }

        C c = new C();
    }

    B b = new B();

    public static void main(String[] args) {
        A a = new A();
        B b = a.new B();
        B.C c = b.new C();
        c.s();
    }
}
