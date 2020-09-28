package innerClass.uzd3;

public class OuterClassStaticTest {
    private String name;
    protected String nr;
    int sk;

    public static class InnerStaticClass{

    }

    public static void main(String[] args) {
        OuterClassStaticTest outClass = new OuterClassStaticTest();
        InnerStaticClass innerClass = new InnerStaticClass();

    }
}
