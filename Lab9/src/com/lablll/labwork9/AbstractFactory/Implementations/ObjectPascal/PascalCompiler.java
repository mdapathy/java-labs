package com.lablll.labwork9.AbstractFactory.Implementations.ObjectPascal;

import com.lablll.labwork9.AbstractFactory.Intefaces.Compiler;

/**
 * Class represents pascal compiler
 */
public class PascalCompiler implements Compiler {
    @Override
    public void compile() {
        System.out.println("Will compile some Pascal code in the future");
    }
}
