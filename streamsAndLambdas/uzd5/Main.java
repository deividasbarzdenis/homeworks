package streamsAndLambdas.uzd5;

public class Main {
    public static void main(String[] args) {
        SquareRoot squareRoot = Math::sqrt;
        squareRoot.findSquareRoot(6);
    }
}
