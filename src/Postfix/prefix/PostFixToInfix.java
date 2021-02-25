package Postfix.prefix;

import java.util.ArrayDeque;

public class PostFixToInfix {
    private boolean isOperator(char element){
        return switch (element){
            case '^','*','/','+','-'-> true;
            default -> false;
        };
    }
    private int precedence(char element){
        return switch (element){
            case '^'-> 3;
            case '*','/'-> 2;
            case '+','-' -> 1;
            default -> 0;
        };
    }
    public String postFixToPrefix(String postfix){
        String infix="";
        ArrayDeque <String> stack =new ArrayDeque<String>();
        postfix=postfix.concat(Character.toString(')'));
        for (int i = 0; i < postfix.length()-1; i++) {
            char element=postfix.charAt(i);
            if(element!=')'){
                if(!isOperator(element)){
                    stack.push(Character.toString(element));
                }
                else {
                    String a=stack.pop();
                    String b=stack.pop();
                    stack.push(b+element+a);
                }
            }
        }
        infix=stack.peek();
        return infix;
    }
}
