package com.lablll.labwork9.AbstractFactory;

import com.lablll.labwork9.AbstractFactory.Intefaces.Compiler;
import com.lablll.labwork9.AbstractFactory.Intefaces.Debugger;
import com.lablll.labwork9.AbstractFactory.Intefaces.IdeFactory;
import com.lablll.labwork9.AbstractFactory.Intefaces.Validator;

/**
 * Class represents an Ide
 */
public class Ide {
    /**
     * Inner compile
     */
    Compiler compiler;
    /**
     * Inner debugger
     */
    Debugger debugger;
    /**
     * Inner validator
     */
    Validator validator;

    /**
     * @param factory factory used to create inner structures of an ide
     */
    public Ide(IdeFactory factory) {
        compiler = factory.createCompiler();
        debugger = factory.createDebugger();
        validator = factory.createValidator();
    }

    /**
     * Simulates ide's work
     */
    public void work() {
        validator.validate();
        compiler.compile();
        debugger.debug();
    }
}
