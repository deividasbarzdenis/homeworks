package comparator.uzd2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Y {
    List<X> saveXList = new ArrayList<>();

    public Y() {
        saveXList.add(new X());
        saveXList.add(new X());
        saveXList.add(new X());
    }

    public List<X> sortAsC() {
        Collections.sort(saveXList);
        return saveXList;
    }
    public List<X> sortDsc() {
        Collections.reverse(saveXList);
        return saveXList;
    }
}
