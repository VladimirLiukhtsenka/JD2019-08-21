package by.it.yuntsevich.calc;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Parser {
    Var calc(String expression) throws CalcException{


        expression = expression.replace(" ", "");
        String[] part = expression.split(Patterns.OPERATION, 2);

        Var two = Var.createVar(part[part.length-1]);
        if (expression.contains("="))
            return Var.saveVar(part[0], two);
        Var one = Var.createVar(part[0]);
        if (part.length == 1) {
            return one;
        }

        Pattern patternOperation = Pattern.compile(Patterns.OPERATION);
        Matcher matcher = patternOperation.matcher(expression);
        if (matcher.find()) {
            String operation = matcher.group();
            //TODO add exceptions
            switch (operation) {
                case "+":
                    return one.add(two);
                case "-":
                    return one.sub(two);
                case "*":
                    return one.mul(two);
                case "/":
                    return one.div(two);
            }

        }
        return null;
    }

}
