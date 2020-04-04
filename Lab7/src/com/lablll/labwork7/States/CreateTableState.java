package com.lablll.labwork7.States;

import com.lablll.labwork7.TextHandle;

/**
 * State after a button on menu is pushed
 */
public class CreateTableState extends State {


    final private HandleFunction defaultHandle = () -> {
        System.out.println("Show Table creation interface");
    };


    /**
     * Default constructor
     */
    public CreateTableState() {
        super();
        handler.add(defaultHandle);
    }

    /**
     * Constructor with passed textHandler
     *
     * @param textHandle previous textHandler
     */
    public CreateTableState(TextHandle textHandle) {
        super(textHandle);
        handler.add(defaultHandle);

    }

    @Override
    public void enterText(String s) {
        System.out.println(TextHandle.getInput());
    }
}
