package by.it.rubatskii.jd01_09;

import java.util.regex.Pattern;

public class Patterns {

    static final String OPERATION = "[-+*/]";
    static final String SCALAR = "-?[0-9]+(\\.[0-9]+)?";
    static final String VECTOR = "\\{" + SCALAR + "(," + SCALAR + ")*}";
    static final String MATRIX = "\\{" + VECTOR + "(," + VECTOR + ")*}";


    private Patterns() {

    }
}
