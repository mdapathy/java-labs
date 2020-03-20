import com.lablll.labwork6.IntArray;
import com.lablll.labwork6.ReverseSort;
import com.lablll.labwork6.SelectionSort;

public class Main {
    /**
     * Example of the use of strategy pattern
     *
     * @param args command line arguments
     */
    public static void main(String[] args) {
        IntArray array = new IntArray(new Integer[]{7, -1, 0, 5, 3, 2, -9, 4});
        array.show();
        array.sort();
        array.show();

        array.setSortingStrategy(new ReverseSort<>());
        array.sort();
        array.show();

        array.setSortingStrategy(new SelectionSort<>());
        array.sort();
        array.show();


    }
}
