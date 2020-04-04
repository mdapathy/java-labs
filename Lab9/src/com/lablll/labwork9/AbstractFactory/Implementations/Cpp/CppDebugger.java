package com.lablll.labwork9.AbstractFactory.Implementations.Cpp;

import com.lablll.labwork9.AbstractFactory.Intefaces.Debugger;

/**
 * Class that represents c++ debugger
 */
public class CppDebugger implements Debugger {
    /**
     * Debugger specifics
     */
    private static String specifics = "cpp debugger 1.5.0";

    @Override
    public void debug() {
        System.out.println("Debugging some c++ code with " + specifics);
    }
}
