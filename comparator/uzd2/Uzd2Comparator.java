package comparator.uzd2;

import java.util.List;

public class Uzd2Comparator {
    public static void main(String[] args) {
        Y y = new Y();
        List<X> sortedList = y.sortAsC();
        List<X> descsortedList = y.sortDsc();

        System.out.println("Suma");
    }
}
