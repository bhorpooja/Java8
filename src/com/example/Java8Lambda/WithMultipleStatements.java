package com.example.Java8Lambda;

/**
 * Created by pooja on 23/9/17.
 */
interface Statements{
    String multiple(String msg);
}
public class WithMultipleStatements {
    public static void main(String[] args) {
        //interface implementation using lambda with multiple statements
        Statements s1=msg -> {
          String str="I would like to say ";
          String str1=str+msg;
          return str1;
        };
        System.out.println(s1.multiple("Time is Precise...."));

    }

}
