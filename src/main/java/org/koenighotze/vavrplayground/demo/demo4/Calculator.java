package org.koenighotze.vavrplayground.demo.demo4;

import static java.lang.String.format;
import static java.lang.System.out;

/**
 * @author David Schmitz
 */
public class Calculator {
    public int add(int a, int b) {
        out.println(format("Adding %d and %d", a, b));
        return a + b;
    }
}
