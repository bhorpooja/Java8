package com.example.Java8MethodReference.StaticMethodReference;

import java.util.function.BiFunction;

/**
 * Created by pooja on 23/9/17.
 */
interface Addable{
    public static int add(int a,int b){
        return a+b;
    }
    public static float add(int a,float b){
        return a+b;
    }
    public static float add(float a,float b){
        return a+b;
    }
}
public class OverloadMethodByMethodReference {

        //override static method by method reference using BiFunction Interface &
        //Here, we defined and overload three add method

    public static void main(String[] args) {
        BiFunction<Integer,Integer,Integer> adder1=Addable::add;
        BiFunction<Integer,Float,Float> adder2=Addable::add;
        BiFunction<Float,Float,Float> adder3=Addable::add;
        int result1=adder1.apply(10,10);
        float result2=adder2.apply(10,10.0f);
        float result3=adder3.apply(10.0f,10.0f);
        System.out.println("1st Addition : "+result1);
        System.out.println("2nd Addition : "+result2);
        System.out.println("3rd Addition : "+result3);

    }
}
