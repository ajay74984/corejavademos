package googleguava.cache.customcache;

public interface Cache<K, V> {

     V get(K key);

     void put(K key, V value, long timeInMiliSeconds);

     void clear();

     void remove(K key);

     long size();
}
