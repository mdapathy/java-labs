package com.lablll.labwork9.AbstractFactory.Implementations.Cpp;

import com.lablll.labwork9.AbstractFactory.Intefaces.Compiler;

/**
 * Class that represents c++ compiler
 */
public class CppCompiler implements Compiler {
    /**
     * Compiler specifics
     */
    private static String specifics = "gcc compiler 1.14";

    @Override
    public void compile() {
        System.out.println("Compiling some c++ code with " + specifics);
    }

}
