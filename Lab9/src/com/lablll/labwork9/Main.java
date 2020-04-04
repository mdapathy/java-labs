package com.lablll.labwork9;

import com.lablll.labwork9.AbstractFactory.Ide;

import static com.lablll.labwork9.AbstractFactory.IdeConfiguration.configureIde;

public class Main {

    public static void main(String[] args) {

        Ide ideCpp = configureIde("C++");
        Ide ideJava = configureIde("Java");

        ideCpp.work();
        ideJava.work();


    }
}
