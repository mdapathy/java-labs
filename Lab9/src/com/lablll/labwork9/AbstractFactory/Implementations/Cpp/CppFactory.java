package com.lablll.labwork9.AbstractFactory.Implementations.Cpp;

import com.lablll.labwork9.AbstractFactory.Intefaces.Compiler;
import com.lablll.labwork9.AbstractFactory.Intefaces.Debugger;
import com.lablll.labwork9.AbstractFactory.Intefaces.IdeFactory;
import com.lablll.labwork9.AbstractFactory.Intefaces.Validator;

/**
 * Class that represents c++ factory
 */
public class CppFactory implements IdeFactory {
    /**
     * @return c++ validator
     */
    @Override
    public Validator createValidator() {
        return new CppValidator();
    }

    /**
     * @return c++ compiler
     */
    @Override
    public Compiler createCompiler() {
        return new CppCompiler();
    }

    /**
     * @return c++ debugger
     */
    @Override
    public Debugger createDebugger() {
        return new CppDebugger();
    }
}
