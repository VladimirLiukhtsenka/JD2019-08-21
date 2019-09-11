package by.it.krautsevich.jd01_09;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Parser {
    Var calc (String expression) {
        expression = expression.replace(" " , "") ;
        String[] parts = expression.split(Patterns.OPERATIONS , 2) ;
        Var one = Var.createVar(parts[0]) ;
        if (parts.length == 1)
        return one;
        Var two = Var.createVar(parts[1]) ;
        Pattern patternOperation =Pattern.compile(Patterns.OPERATIONS) ;
        Matcher matcher = patternOperation.matcher(expression);
        if (matcher.find()) {
            String operation = matcher.group() ;
            switch (operation) {
                case "+" : return one.add(two) ;
                case "-" : return one.sub(two) ;
                case "*" : return one.mul(two) ;
                case "/" : return one.div(two) ;

            }
        }

        return null ;
    }
}
