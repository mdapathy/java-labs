package com.lablll.labwork9.AbstractFactory.Implementations.ObjectPascal;

import com.lablll.labwork9.AbstractFactory.Intefaces.Compiler;
import com.lablll.labwork9.AbstractFactory.Intefaces.Debugger;
import com.lablll.labwork9.AbstractFactory.Intefaces.IdeFactory;
import com.lablll.labwork9.AbstractFactory.Intefaces.Validator;

/**
 * Class that represents pascal factory
 */
public class PascalFactory implements IdeFactory {
    /**
     * @return pascal validator
     */
    @Override
    public Validator createValidator() {
        return new PascalValidator();
    }

    /**
     * @return pascal compiler
     */
    @Override
    public Compiler createCompiler() {
        return new PascalCompiler();
    }

    /**
     * @return pascal debugger
     */
    @Override
    public Debugger createDebugger() {
        return new PascalDebugger();
    }
}
