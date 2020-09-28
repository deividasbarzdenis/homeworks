package comparator.uzd2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class X implements Comparable<X>{
    Random rdm = new Random();
    private List<Integer> list=new ArrayList<>();

    public X() {
        list.add(rdm.nextInt());
        list.add(rdm.nextInt());
        list.add(rdm.nextInt());

    }

    public int sum(){
        int sum=0;
        for (Integer nu:list){
            sum+=nu;
        }
        return sum;
    }

    @Override
    public int compareTo(X otherX) {
        return Integer.compare(sum(),otherX.sum());
    }
}
/*Sukurti klasę X, kuri turi bent 3 elementų sąrašą skaičių (užpildymui galima panaudoti
Random().nextInt() ). Sukurti klasę Y, kuri saugo prieš tai sukurtos klasės objektų sąrašą (pvz.
ArrayList<X> ). Surūšiuoti Y klasėje elementus saugantį sąrašą pagal tai, kokia yra jo sąraše
esančių X klasės sąrašo skaičių suma. Programa turi mokėti rūšiuoti tiek didėjimo, tiek ir
mažėjimo tvarka ( Collections.reverse() ).*/