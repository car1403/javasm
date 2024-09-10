package frame;

import java.util.List;

public interface Db<K,V> {
    void insert(V v);
    void update(V v);
    void delete(K k);
    V select(K k);
    List<V> select();
}
