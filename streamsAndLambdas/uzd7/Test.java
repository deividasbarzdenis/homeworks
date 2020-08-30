package streamsAndLambdas.uzd7;

public class Test {

    private int op(int a, int b, Func1 fob){
        return fob.op(a,b);
    }

    public static void main(String[] args) {
        Func1 add = (int x, int y) -> x+y;
        Func1 multiply = (int x, int y) -> x*y;

        Test test = new Test();

        System.out.println("Addition is " + test.op(6,3,add));
        System.out.println("Multiplicatio is "+ test.op(6,3,multiply));

        Func2 func2 = msg -> System.out.println("Hello "+ msg);
        func2.sayMsg("now");
    }
}
