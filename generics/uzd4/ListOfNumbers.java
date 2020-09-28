package generics.uzd4;

import java.util.ArrayList;
import java.util.List;

public class ListOfNumbers {
    List<Double> doubleNUmbers;

    public ListOfNumbers() {
        doubleNUmbers = new ArrayList<>();
    }

    public void addNumber(double number){
        doubleNUmbers.add(number);
    }
    public Double getAverage(){
        double sum = 0;
        for (Double number:doubleNUmbers){
            sum +=number;
        }
        return sum/(doubleNUmbers.size()-1);
    }

    @Override
    public String toString() {
        return "ListOfNumbers{" +
                "numbers=" + doubleNUmbers +
                '}';
    }
}
