package com.example.Java8Lambda;

/**
 * Created by pooja on 23/9/17.
 */
interface Message{
    String msg(String name);
}
public class WithSingleParameter {
    public static void main(String[] args) {
        //interface implementation using lambda with no parameter
        //with parenthesis
        Message m=(name)-> {return "hiiii...."+name;};
        System.out.println(m.msg("Pooja"));

        //without parenthesis
        Message m1=name ->{return "hello...."+name;};
        System.out.println(m1.msg("Sonu"));
    }
}
