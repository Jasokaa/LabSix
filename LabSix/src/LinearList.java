/**
 * Product interface representing a linear list of integers.
 */
public interface LinearList {
    /**
     * Adds an integer to the list.
     * @param value Integer to be added.
     */
    void add(int value);

    /**
     * Creates and returns an iterator for this list.
     * @return Iterator for the linear list.
     */
    Iterator createIterator();
}