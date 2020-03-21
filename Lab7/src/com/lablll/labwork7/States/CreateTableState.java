package com.lablll.labwork7.States;

import com.lablll.labwork7.TextHandle;

/**
 * State after a button on menu is pushed
 */
public class CreateTableState extends State {
    /**
     * Default constructor
     */
    public CreateTableState() {
        super();
        handler.add(() -> {
            System.out.println("Show Table creation interface  with " + text.describe());
        });

    }

    /**
     * Constructor with passed textHandler
     *
     * @param textHandle previous textHandler
     */
    public CreateTableState(TextHandle textHandle) {
        super(textHandle);
        handler.add(() -> {
            System.out.println("Show Table creation interface  with " + text.describe());
        });

    }
}
