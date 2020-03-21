package com.lablll.labwork7.States;

import com.lablll.labwork7.TextHandle;

/**
 * Default state of the app when it is opened
 */
public class DefaultState extends State {

    /**
     * Default constructor
     */
    public DefaultState() {
        super();
        handler.add(() -> {
            System.out.println("Show default interface  with " + text.describe());
        });

    }

    /**
     * Constructor with passed textHandler
     *
     * @param textHandle previous textHandler
     */
    public DefaultState(TextHandle textHandle) {
        super(textHandle);
        handler.add(() -> {
            System.out.println("Show default interface with " + text.describe());
        });

    }


}
