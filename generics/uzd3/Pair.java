package generics.uzd3;

public class Pair <K, V>{
    public K key;
    public V value;

    public Pair(K key, V vslue) {
        this.key = key;
        this.value = vslue;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }
}
