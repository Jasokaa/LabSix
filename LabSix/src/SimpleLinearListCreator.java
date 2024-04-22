/**
 * ConcreteCreator that implements the LinearListCreator interface.
 */
public class SimpleLinearListCreator implements LinearListCreator {
    @Override
    public LinearList createLinearList() {
        return new SimpleLinearList();
    }
}
