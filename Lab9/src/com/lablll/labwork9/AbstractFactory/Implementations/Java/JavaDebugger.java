package com.lablll.labwork9.AbstractFactory.Implementations.Java;

import com.lablll.labwork9.AbstractFactory.Intefaces.Debugger;

/**
 * Class represents java debugger
 */
public class JavaDebugger implements Debugger {
    @Override
    public void debug() {
        System.out.println("Debugging some Java code");

    }
}
