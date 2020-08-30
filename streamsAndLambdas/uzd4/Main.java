package streamsAndLambdas.uzd4;

public class Main {
    public static void main(String[] args) {
        System.out.printf("18 + 36.5 = %.2f%n", calculate((double v1, double v2)->
                v1+v2,18, 36.5));
        System.out.printf("89 / 2.9 = %.2f%n", calculate((v1, v2)->
                v1/v2,89,2.9));
        System.out.printf("-89 = %.2f%n", calculate(v->-v, 89));
        System.out.printf("18 * 18 = %.2f%n",calculate((double v)->v*v,
                18));
    }
    private static double calculate(BInaryCalculator calculator,
                                    double v1, double v2){
        return calculator.calculate(v1,v2);
    }
    private static double calculate(UnaryCalculator calc, double v){
        return calc.calculate(v);
    }
}
