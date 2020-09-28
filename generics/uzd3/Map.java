package generics.uzd3;

import java.util.ArrayList;
import java.util.List;

public class Map<K, V> {
    private List<Pair<K, V>> pairList;

    public Map() {
        pairList = new ArrayList<>();
    }

    public void addToMap(K key, V value){
        pairList.add(new Pair<>(key,value));
    }

    public V getValue(K key){
        for (Pair<K, V> pair : pairList){
            if (pair.getKey().equals(key)){
                return pair.getValue();
            }
        }
        return null;
    }
}

