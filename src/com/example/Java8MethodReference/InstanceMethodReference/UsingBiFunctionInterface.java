package com.example.Java8MethodReference.InstanceMethodReference;

import java.util.function.BiFunction;

/**
 * Created by pooja on 23/9/17.
 */
class Arithmatic{
    public int add(int a,int b){
        return a+b;
    }
}
public class UsingBiFunctionInterface {

    public static void main(String[] args) {

    //Here, we are referring add method to apply method using BiFunction Interface.
    BiFunction<Integer,Integer,Integer> addet=new Arithmatic()::add;
    int result=addet.apply(10,20);
        System.out.println("Addition : "+result);

    }
}
