/**
 * Example usage of the factory method pattern to manage linear lists.
 */
public class Main {
    public static void main(String[] args) {
        LinearListCreator creator = new SimpleLinearListCreator();
        LinearList list = creator.createLinearList();

        list.add(10);
        list.add(20);
        list.add(30);

        Iterator it = list.createIterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}