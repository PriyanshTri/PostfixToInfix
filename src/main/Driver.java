package main;
import Postfix.prefix.PostFixToInfix;


public class Driver {
    public static void main(String[] args) {
        PostFixToInfix obj=new PostFixToInfix();
        String str="ABC*DEF^/G*-H*+";
        System.out.println("result is:");
        System.out.println(obj.postFixToPrefix(str));
    }
}
