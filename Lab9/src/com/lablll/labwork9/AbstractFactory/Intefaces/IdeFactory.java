package com.lablll.labwork9.AbstractFactory.Intefaces;

/**
 * Abstract factory that creates an ide's components
 */
public interface IdeFactory {
    /**
     * @return validator
     */
    Validator createValidator();

    /**
     * @return compiler
     */
    Compiler createCompiler();


    /**
     * @return debugger
     */
    Debugger createDebugger();
}
