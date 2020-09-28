package generics.uzd1;

import java.util.Arrays;

public class Uzd1Generics {
    public static void main(String[] args) {
        Integer number;
        Box<Integer> integerBox = new Box<>();
        integerBox.set(10);

        number = integerBox.get();

        System.out.println(number);

        Pair<String , Integer> p1 = new OrderedPair
                <String , Integer>("Eight", 8);
        Pair<String , Integer> p2 = new OrderedPair
                <String , Integer>("nine", 9);
        Pair<String, Box<Integer>> p = new OrderedPair<>("Primes",
                new Box<Integer>());

        Pair1<Integer, String> s1 = new Pair1<>(1, "apple");
        Pair1<Integer, String> s2 = new Pair1<>(2, "pear");

        boolean same = Util.<Integer, String>compare(s1,s2);
        boolean same1 = Util.compare(s1, s2);// taspat kaip virsuje

        Calculator calculator = new Calculator(8, 8.5);
        calculator.sum();
        //List<Integer> inrt = (List<Integer>) Arrays.asList(1,5,10);
       /* printList(inrt);*/

    }
  /*  public static void printList(List<? extends Number> list1){
        for (Number n:list1){
            System.out.println(n.doubleValue());
        }
    }*/
}
