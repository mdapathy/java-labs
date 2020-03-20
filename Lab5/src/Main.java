import com.lablll.labwork5.ConcreteList;

import java.util.Iterator;

public class Main {

    /**
     * Example of the usage of lists and iterators
     * @param args command line arguments
     */
    public static void main(String[] args) {
        ConcreteList concreteList = new ConcreteList(
                "An", "iterator", "over", "a", "collection"
        );

        Iterator<String> iterator = concreteList.iterator();

        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }

        System.out.println("\n\nFiltering by the length, must be less than or equal 6 characters\n");
        Iterator<String> filterIterator = concreteList.filterIterator(6);

        while (filterIterator.hasNext()) {
            System.out.print(filterIterator.next() + " ");
        }


    }
}
