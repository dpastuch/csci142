import java.util.Collection;

/**
 * Created by d1pas on 2/26/2017.
 */
public interface DB<K, V> {

    /**
     * Add a value to the database.
     * @param value Value to add
     * @return The previous value associated with the key, otherwise null
     */
    public V addValue(V value);

    /**
     * Get all the values in the database.
     * @return Collection of all values
     */
    public Collection<V> getAllValues();

    /**
     * Get the value associated with this key.
     * @param key Key in database
     * @return Value associated with key
     */
    public V getValue(K key);

    /**
     * Check if the database contains this key.
     * @return True if database contains key, otherwise false
     */
    public boolean hasKey(K key);
}
