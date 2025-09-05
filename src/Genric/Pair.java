package Genric;

public class Pair<K, V> {
    private K key;
    private V value;

    public <T> Pair(T key, T value) {
        this.key = (K) key;
        this.value = (V) value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }

    public static void main(String[] args) {
        Pair<String, Integer> pair1 = new Pair<>("One", 1);
        System.out.println("Pair1: Key = " + pair1.getKey() + ", Value = " + pair1.getValue());

        Pair<String, String> pair2 = new Pair<>("Hello", "World");
        System.out.println("Pair2: Key = " + pair2.getKey() + ", Value = " + pair2.getValue());
    }
}
