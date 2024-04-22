import java.util.ArrayList;
import java.util.List;

/**
 * ConcreteProduct class for a simple linear list implementation.
 */
public class SimpleLinearList implements LinearList {
    private List<Integer> data;

    public SimpleLinearList() {
        this.data = new ArrayList<>();
    }

    @Override
    public void add(int value) {
        data.add(value);
    }

    @Override
    public Iterator createIterator() {
        return new ForwardIterator(data);
    }
}