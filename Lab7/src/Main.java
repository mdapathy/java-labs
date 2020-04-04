import com.lablll.labwork7.Screen;
import com.lablll.labwork7.States.DefaultState;

public class Main {
    /**
     * Example of the usage of state pattern
     *
     * @param args command line arguments
     */
    public static void main(String[] args) {

        Screen s = new Screen(new DefaultState());

        //changing the reaction on the go
        s.changeHandle(() -> {
            System.out.println("React differently");
        });

        s.addHandle(() -> {
            System.out.println("React differently x2 \n");
        });

        s.enterText("Entered in default state,");

        Screen.menu.createTable();

        s.enterText("Entered in create table state, ");

        System.out.println();

        Screen.menu.showMain();


    }
}
