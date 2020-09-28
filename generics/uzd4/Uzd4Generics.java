package generics.uzd4;

public class Uzd4Generics {
    public static void main(String[] args) {
        ListOfNumbers list1 = new ListOfNumbers();
        list1.addNumber(1.5);
        list1.addNumber(10);
        list1.addNumber(2.5);

        ListOfNumbers list2 = new ListOfNumbers();
        list2.addNumber(0);
        list2.addNumber(1);

        ListOfNumbers list3 = new ListOfNumbers();
        list3.addNumber(100);

        ListOfNumbers result1 = findWithAverage(list1,list2,list3);
        ListOfNumbers result2 = findWithAverage(list1,list2);

        System.out.println(result1);
        System.out.println(result2);
    }

    public static <T extends ListOfNumbers> T findWithAverage(T... list){
        T max = list[0];
        for (T element : list) {
            if (element.getAverage() > max.getAverage()) {
                max = element;
            }
        }
        return max;
    }
}
