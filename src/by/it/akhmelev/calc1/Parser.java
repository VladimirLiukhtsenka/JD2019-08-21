package by.it.akhmelev.calc1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Parser {

    Var calc(String expression) {
        expression = expression.replace(" ", "");
        String[] part = expression.split(Patterns.OPERATION, 2);

        Var one = Var.createVar(part[0]); //may be null for A=7
        if (part.length == 1)
            return one;
        Var two = Var.createVar(part[1]);

        Pattern patternOperation = Pattern.compile(Patterns.OPERATION);
        Matcher matcher = patternOperation.matcher(expression);
        if (matcher.find()) {
            switch (matcher.group()) {
                case "=":
                    Var.save(part[0], two);
                    return two;
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
        //add exceptions
        return null;
    }

}
