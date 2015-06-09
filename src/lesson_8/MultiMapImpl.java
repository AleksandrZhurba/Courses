package lesson_8;


import java.util.*;

public class MultiMapImpl<K,V> extends HashMap<K,V> implements MultiMap<K,V> {

    private Map<K, ArrayList<V>> multiMap = new HashMap<K, ArrayList<V>>();


    @Override
    public String toString() {
        return "MultiMapImpl{" +
                "multiMap=" + multiMap +
                '}';
    }

    @Override
    public V put(K key, V value) {
        if (multiMap.containsKey(key)) {

            ArrayList<V> values = multiMap.get(key);
            values.add(value);
            multiMap.put(key, values);

        } else {
            ArrayList<V> values = new ArrayList<V>();
            values.add(value);
            multiMap.put(key,values);
        }

        return value;
    }

    @Override
    public int countValues(K key) {
        return 0;
    }



    @Override
    public Iterator<V> valuesIterator(K key) {
        return null;
    }
}
