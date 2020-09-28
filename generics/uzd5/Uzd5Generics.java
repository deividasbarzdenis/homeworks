package generics.uzd5;

public class Uzd5Generics {
    public static void main(String[] args) {
        SuperPair<Double, Double, Integer> one = new SuperPair<>(1.0, 2.0, 3);
        System.out.println(one);

        SuperPair<String, String, Double> two = new SuperPair<>("One", "two", 3.0);
        System.out.println(one);

        /*SuperPair<String, String, String> three = new SuperPair<>("Day", "tomorrow", "wrong");
        System.out.println(one);*/
    }

}
