package com.example.Java8MethodReference.StaticMethodReference;

import java.util.function.BiFunction;

/**
 * Created by pooja on 23/9/17.
 */
interface Arithmatic{
    public static int add(int a,int b){
        return a+b;
    }
}
public class UsingBifunctionInterface {

        //Here, we are using predefined BiFunction<T,U,R> Interface
        //& it's apply(T,U) method to refer add() method

        public static void main(String[] args) {
             BiFunction<Integer,Integer,Integer>  adder=Arithmatic::add;
             int result=adder.apply(10,10);
             System.out.println("Addition : "+result);
    }
}
