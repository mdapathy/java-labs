package com.lablll.labwork9.AbstractFactory;

import com.lablll.labwork9.AbstractFactory.Implementations.Cpp.CppFactory;
import com.lablll.labwork9.AbstractFactory.Implementations.Java.JavaFactory;
import com.lablll.labwork9.AbstractFactory.Implementations.ObjectPascal.PascalFactory;
import com.lablll.labwork9.AbstractFactory.Intefaces.IdeFactory;

public class IdeConfiguration {
    static public Ide configureIde(String ideType) {
        IdeFactory factory;
        switch (ideType) {
            case "Java":
                factory = new JavaFactory();
                break;
            case "C++":
                factory = new CppFactory();
                break;
            case "Object Pascal":
                factory = new PascalFactory();
                break;
            default:
                throw new IllegalArgumentException("Such an IDE can't be produced");

        }

        return new Ide(factory);
    }


}
