package by.it.zavadski.calc;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Parser {
    Var calc(String expression){
        expression.replace(" ","");
        String[] part = expression.split(Patterns.OPERATION,2);
        if(part.length==1){
            return Var.createVar(part[0]);
        }
        //A=7
        Var one= Var.createVar(part[0]);
        if (part.length==1) {
            return one;
        }
        Var two= Var.createVar(part[1]);
        if(expression.contains("=")){
            return Var.saveVar(part[0],two);
        }
        Pattern patternOperation = Pattern.compile(Patterns.OPERATION);
        Matcher matcher = patternOperation.matcher(expression);
        if (matcher.find()){
            String operation=matcher.group();
            //TODO add exceptions
            switch (operation){
                case "+":return one.add(two);
                case "-":return one.sub(two);
                case "*":return one.mul(two);
                case "/":return one.div(two);
            }
        }
        return null;
    }
}