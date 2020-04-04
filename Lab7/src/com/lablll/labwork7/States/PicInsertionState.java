package com.lablll.labwork7.States;

import com.lablll.labwork7.TextHandle;

public class PicInsertionState extends State {

    final protected HandleFunction
            defaultHandle = () -> {
        System.out.println("Show picture insertion interface");
    };


    /**
     * Default constructor
     */
    public PicInsertionState() {
        super();
        handler.add(defaultHandle);

    }

    /**
     * @param textHandle textHandler
     */
    public PicInsertionState(TextHandle textHandle) {
        super(textHandle);
        handler.add(defaultHandle);

    }

    /**
     * React to user input
     *
     * @param s string to be potentially added
     */
    @Override
    public void enterText(String s) {
        System.out.println(TextHandle.getInput());
    }
}
