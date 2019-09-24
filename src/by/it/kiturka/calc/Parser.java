package by.it.kiturka.calc;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Parser {

    Var calc(String expression){
        expression=expression.replace(" ", "");
        String [] parts=expression.split(Patterns.OPERATION);

        if(expression.contains("=")){ // B=A
            return Var.saveVar(parts[0], parts[1]);
        }

        Var first = Var.createVar(parts[0]);
        Var second = Var.createVar(parts[1]);
        if(first==null || second==null){
            return null;  //expression
        }
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