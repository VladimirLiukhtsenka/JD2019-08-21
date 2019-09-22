package by.it.zavadski.calc;

public final class Patterns {
    static final String OPERATION="[-=+/*]";
    static final String SCALAR="-?[\\d]+(\\.\\d+)?";
    static final String VECTOR="\\{" + SCALAR+ "(," + SCALAR + ")*}";
    static final String MATRIX="\\{"+VECTOR+"(,"+VECTOR+")*}";

    private Patterns(){};
}
