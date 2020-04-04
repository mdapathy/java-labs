package com.lablll.labwork9.AbstractFactory.Implementations.Java;

import com.lablll.labwork9.AbstractFactory.Intefaces.Compiler;
import com.lablll.labwork9.AbstractFactory.Intefaces.Debugger;
import com.lablll.labwork9.AbstractFactory.Intefaces.IdeFactory;
import com.lablll.labwork9.AbstractFactory.Intefaces.Validator;

/**
 * Class that represents java factory
 */
public class JavaFactory implements IdeFactory {
    /**
     * @return java validator
     */
    @Override
    public Validator createValidator() {
        return new JavaValidator();
    }

    /**
     * @return java compiler
     */
    @Override
    public Compiler createCompiler() {
        return new JavaCompiler();
    }

    /**
     * @return java debugger
     */
    @Override
    public Debugger createDebugger() {
        return new JavaDebugger();
    }
}
