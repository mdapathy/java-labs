package com.lablll.labwork7.States;

import com.lablll.labwork7.TextHandle;

public class PicInsertionState extends State {
    /**
     * Default constructor
     */
    public PicInsertionState() {
        super();
        handler.add(() -> {
            System.out.println("Show picture insertion interface  with " + text.describe());
        });

    }

    /**
     * @param textHandle textHandler
     */
    public PicInsertionState(TextHandle textHandle) {
        super(textHandle);
        handler.add(() -> {
            System.out.println("Show picture insertion interface  with " + text.describe());

        });

    }
}
