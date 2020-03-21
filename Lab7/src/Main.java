import com.lablll.labwork7.Screen;

public class Main {
    /**
     * Example of the usage of state pattern
     *
     * @param args command line arguments
     */
    public static void main(String[] args) {
        Screen s = new Screen();
        Screen.menu.picInsertion();

        System.out.println();

        s.toolBar.decreaseFontSize();

        //changing the reaction on the go
        Screen.getState().changeHandle(() -> {
            System.out.println("React differently ");
        });

        System.out.println();

        Screen.getState().addHandle(() -> {
            System.out.println("React differently x2 ");
        });
    }
}
