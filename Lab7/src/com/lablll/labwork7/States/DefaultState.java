package com.lablll.labwork7.States;

import com.lablll.labwork7.TextHandle;

/**
 * Default state of the app when it is opened
 */
public class DefaultState extends State {

    final private HandleFunction
            defaultHandle = () -> {
        System.out.println("Show default interface");
    };


    /**
     * Default constructor
     */
    public DefaultState() {
        super();
        handler.add(defaultHandle);
    }

    /**
     * Constructor with passed textHandler
     *
     * @param textHandle previous textHandler
     */
    public DefaultState(TextHandle textHandle) {
        super(textHandle);
        handler.add(defaultHandle);

    }

    @Override
    public void enterText(String s) {
        System.out.println(textHandle.enterText(s));
    }


}
