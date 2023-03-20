package pl.beck.apollo.shared.key_value;

public class KeyValue <K, V> {
    private final K key;
    private final V value;
    public KeyValue(K key, V value) {
        this.key = key;
        this.value = value;
    }
    public K getKey() {
        return key;
    }
    public V getValue() {
        return value;
    }
    @Override
    public String toString() {
        return "KyeValue [key=" + key + ", value=" + value + "]";
    }
}
