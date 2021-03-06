package by.it.rubatskii.calc;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Parser {
    Var calc(String expression) {
        expression = expression.replace(" ", "");
        String[] part = expression.split(Patterns.OPERATION);
        if (part.length == 1)
            return Var.createVar(part[0]);
        Var two = Var.createVar(part[1]);
        Pattern patternOperation = Pattern.compile(Patterns.OPERATION);
        Matcher matcher = patternOperation.matcher(expression);
String operation="";
if (matcher.find())
    operation = matcher.group();

if (operation.equals("=")){
    Var.save(part[0],two);
    return two;

    }
        Var one = Var.createVar(part[0]);
            switch (operation) {
                case "+": return one.add(two);
                case "-": return one.sub(two);
                case "*": return one.mul(two);
                case "/": return one.div(two);
            }

        return null;
    }
}
