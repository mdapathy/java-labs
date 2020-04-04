package com.lablll.labwork9.AbstractFactory.Implementations.Cpp;

import com.lablll.labwork9.AbstractFactory.Intefaces.Validator;

/**
 * Class that represents c++ validator
 */
public class CppValidator implements Validator {
    /**
     * Validator specifics
     */
    private static String specifics = "cpp validator 1.5.0";

    @Override
    public void validate() {
        System.out.println("Validating some c++ code with " + specifics);
    }
}
