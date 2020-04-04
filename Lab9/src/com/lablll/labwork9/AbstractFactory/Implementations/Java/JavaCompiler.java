package com.lablll.labwork9.AbstractFactory.Implementations.Java;

import com.lablll.labwork9.AbstractFactory.Intefaces.Compiler;

/**
 * Class represents java compiler
 */
public class JavaCompiler implements Compiler {

    @Override
    public void compile() {
        System.out.println("Compiling some Java code");
    }
}
