package com.lablll.labwork7;

import com.lablll.labwork7.States.CreateTableState;
import com.lablll.labwork7.States.DefaultState;
import com.lablll.labwork7.States.PicInsertionState;
import com.lablll.labwork7.States.State;

/**
 * The class that represents the screen of an app
 * with the menu and the toolbar
 */
public class Screen {
    /**
     * State of the app
     */
    private static State state;
    /**
     * Menu interface
     */
    public static Menu menu;
    /**
     * Toolbar interface
     */
    public ToolBar toolBar;

    /**
     * Default constructor that initializes the
     * fields
     */
    public Screen() {
        state = new DefaultState();
        menu = new Menu();
        toolBar = new ToolBar();
        state.handle();
    }

    /**
     * Changes the state of the app
     *
     * @param s state
     */
    private static void setState(State s) {
        state = s;
        s.handle();
    }

    /**
     * @return state of the app
     */
    public static State getState() {
        return state;
    }


    /**
     * Represents the app's menu
     */
    public class Menu {

        /**
         * Changes the state to table creation
         */
        public void tableCreation() {
            Screen.setState(new CreateTableState(Screen.getState().getText()));
        }

        /**
         * Changes the state to default
         */
        public void defaultState() {
            Screen.setState(new DefaultState(Screen.getState().getText()));
        }

        /**
         * Changes the state to pic insertion
         */
        public void picInsertion() {
            Screen.setState(new PicInsertionState(Screen.getState().getText()));
        }


    }

    /**
     * Represents the app's toolbar
     */
    public class ToolBar {
        /**
         * Increases the font size and changes
         * the state to the default one
         */
        public void increaseFontSize() {
            Screen.getState().getText().increaseFontSize();
            Screen.setState(new DefaultState(Screen.getState().getText()));

        }

        /**
         * Decreases the font size and changes
         * the state to the default one
         */
        public void decreaseFontSize() {
            Screen.getState().getText().decreaseFontSize();
            Screen.setState(new DefaultState(Screen.getState().getText()));
        }
    }

}
