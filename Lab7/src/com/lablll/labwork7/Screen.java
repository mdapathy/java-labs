package com.lablll.labwork7;

import com.lablll.labwork7.States.*;

import java.util.HashMap;
import java.util.Map;

/**
 * The class that represents the screen of an app
 * with the menu and the toolbar
 */
public class Screen {
    /**
     * State of the app
     */
    protected static State state;

    private static Map<String, State> stateMap;
    /**
     * Menu interface
     */
    public static Menu menu;
    /**
     * Toolbar interface
     */
    public static ToolBar toolBar;

    /**
     * Default constructor that initializes the
     * fields
     */
    public Screen(State state) {
        Screen.menu = new Menu();
        Screen.toolBar = new ToolBar();
        initializeStateMap();

        Screen.setState(getSpecificState(state.getClass().toString()));
    }

    /**
     * Add text to TextHandle
     *
     * @param s string to be added
     */
    public void enterText(String s) {
        state.enterText(s);
    }

    /**
     * @param stateName className of desired state
     * @return state from the map
     */
    private static State getSpecificState(String stateName) {
        return stateMap.get(stateName) == null ?
                stateMap.get(DefaultState.class.toString()) : stateMap.get(stateName);
    }


    /**
     * Initializes states in the map
     */
    private void initializeStateMap() {
        stateMap = new HashMap<>();
        stateMap.put(DefaultState.class.toString(), new DefaultState());
        stateMap.put(CreateTableState.class.toString(), new CreateTableState());
        stateMap.put(PicInsertionState.class.toString(), new PicInsertionState());
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
     * Changes the apps state and provides the current state with
     * previous textHandle
     *
     * @param str name of the state
     */
    private static void modifyState(String str) {
        State s = getSpecificState(str);
        s.setTextHandle(state.getTextHandle());
        setState(s);
    }


    public void changeHandle(HandleFunction handleFunction) {
        state.changeHandle(handleFunction);
    }


    /**
     * Deletes the handleFunction if it was present
     *
     * @param h handle to delete
     * @return true if it was removed
     */
    final public boolean deleteHandle(HandleFunction h) {
        return state.deleteHandle(h);
    }


    /**
     * Adds function to the list
     *
     * @param h handler to add
     */
    final public void addHandle(HandleFunction h) {
        state.addHandle(h);
    }

    /**
     * Represents the app's menu
     */
    public static class Menu {

        /**
         * Changes the state to table creation
         */
        public void createTable() {
            modifyState(CreateTableState.class.toString());
        }


        /**
         * Changes the state to default
         */
        public void showMain() {
            modifyState(DefaultState.class.toString());
        }

        /**
         * Changes the state to pic insertion
         */
        public void insertPicture() {
            modifyState(PicInsertionState.class.toString());
        }

    }

    /**
     * Represents the app's toolbar
     */
    public static class ToolBar {

        /**
         * Increases the font size and changes
         * the state to the default one
         */
        public void increaseFontSize() {
            state.getTextHandle().increaseFontSize();
            modifyState(DefaultState.class.toString());
        }

        /**
         * Decreases the font size and changes
         * the state to the default one
         */
        public void decreaseFontSize() {
            state.getTextHandle().decreaseFontSize();
            modifyState(DefaultState.class.toString());
        }
    }

}
