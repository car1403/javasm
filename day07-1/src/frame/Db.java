package frame;

public interface Db<K,V> {
    void insert(V v);
    void update(V v);
    void delete(K k);
}
