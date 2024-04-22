/**
 * Product interface for an iterator over a list.
 */
public interface Iterator {
    /**
     * Checks if there is another element in the list.
     * @return true if there is another element, false otherwise.
     */
    boolean hasNext();

    /**
     * Returns the next element in the list.
     * @return The next integer in the list.
     */
    int next();
}