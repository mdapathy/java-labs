package com.lablll.labwork7.States;

import com.lablll.labwork7.TextHandle;

import java.util.ArrayList;

/**
 * Class that represents the state of
 * the application
 */
abstract public class State {

    /**
     * TextHandle represents the size of the font currently in use
     */
    protected TextHandle textHandle;
    /**
     * HandleFunction represents the function called on state change
     */
    protected ArrayList<HandleFunction> handler;

    abstract public void enterText(String s);

    public State() {
        textHandle = new TextHandle();
        handler = new ArrayList<>(1);
    }


    /**
     * Constructor with passed textHandler
     *
     * @param textHandle previous textHandler
     */
    public State(TextHandle textHandle) {
        this.textHandle = textHandle;
        handler = new ArrayList<>(1);
    }

    /**
     * @return textHandle
     */
    public TextHandle getTextHandle() {
        return textHandle;
    }

    /**
     * @param textHandle textHandle to be set
     */
    public void setTextHandle(TextHandle textHandle) {
        this.textHandle = textHandle;
    }


    /**
     * Function that handles the current state of the app
     */
    final public void handle() {
        for (HandleFunction h :
                handler) {
            h.handleState();
        }
    }

    /**
     * Changes the function that handles the current
     * state of the app
     *
     * @param h function that handles the state of the app
     */
    final public void changeHandle(HandleFunction h) {
        handler.clear();
        handler.add(h);
        handle();
    }

    /**
     * Deletes the handleFunction if it was present
     *
     * @param h handle to delete
     * @return true if it was removed
     */
    final public boolean deleteHandle(HandleFunction h) {
        return (handler.size() > 1) && handler.remove(h);
    }


    /**
     * Adds function to the list
     *
     * @param h handler to add
     */
    final public void addHandle(HandleFunction h) {
        handler.add(h);
        handle();

    }

    /**
     * Describes the state and its textHandler
     */
    final public void describeState() {
        System.out.println(this.getClass().getSimpleName() + " with " + TextHandle.getInput() + "in " + TextHandle.getFontSize() + "font size");
    }

}
