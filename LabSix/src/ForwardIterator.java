import java.util.List;
import java.util.NoSuchElementException;

/**
 * ConcreteProduct class for a forward traversal iterator.
 */
public class ForwardIterator implements Iterator {
    private List<Integer> list;
    private int currentIndex;

    public ForwardIterator(List<Integer> list) {
        this.list = list;
        this.currentIndex = 0;
    }

    @Override
    public boolean hasNext() {
        return currentIndex < list.size();
    }

    @Override
    public int next() {
        if (!hasNext()) {
            throw new NoSuchElementException("No more elements in the list");
        }
        return list.get(currentIndex++);
    }
}
