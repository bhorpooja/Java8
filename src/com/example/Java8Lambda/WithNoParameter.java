package com.example.Java8Lambda;

/**
 * Created by pooja on 23/9/17.
 */
interface Sayable{
    String say();
}
public class WithNoParameter {
    public static void main(String[] args) {
        //interface implementation using lambda with no parameter
        Sayable s=()->{return "I have nothing to say.";};
        System.out.println(s.say());
    }
}
