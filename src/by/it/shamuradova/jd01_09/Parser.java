package by.it.shamuradova.jd01_09;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Parser {

    Var calc(String expression){
        expression=expression.replace(" ", "");
        String [] parts=expression.split(Patterns.OPERATION, 2);
        Var first = Var.createVar(parts[0]);
        if(parts.length==1){
            return first;
        }
        Var second = Var.createVar(parts[1]);
        Pattern operationPattern=Pattern.compile(Patterns.OPERATION);
        Matcher operationMatcher=operationPattern.matcher(expression);
        if(operationMatcher.find()){
            String operation = operationMatcher.group();
            switch(operation){
                case "+": return first.add(second);
                case "*": return first.mul(second);
                case "/":return first.div(second);
                case "-":return first.sub(second);
            }
        }
        return null;
    }

}