package com.lablll.labwork9.AbstractFactory.Implementations.Java;

import com.lablll.labwork9.AbstractFactory.Intefaces.Validator;

/**
 * Class represents java validator
 */
public class JavaValidator implements Validator {
    @Override
    public void validate() {
        System.out.println("Validating some Java code");

    }
}
