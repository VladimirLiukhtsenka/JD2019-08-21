package by.it.krautsevich.calc;

public class Patterns {
    private Patterns() {}
    static final String OPERATIONS = "[-=+*/]" ;
    static final String SCALAR = "-?[0-9]+(\\.[0-9]+)?" ;
    static final String VECTOR = "\\{" + SCALAR + "(," + SCALAR + ")*}" ;
    static final String MATRIX = "\\{" + VECTOR + "(," + VECTOR + ")*}" ;
}
