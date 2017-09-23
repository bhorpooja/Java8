package com.example.Java8Lambda;

/**
 * Created by pooja on 23/9/17.
 */
interface Addable{
    int add(int a,int b);
}
public class WithMultipleParameter {
    public static void main(String[] args) {
        //interface implementation using lambda with multiple parameter
        //multiple parameter with DataType
        Addable a1=(int a,int b)->(a+b);
        System.out.println("Addition = "+a1.add(10,10));

        //multiple parameter without Datatype
        Addable a2=(a,b)->{return a+b;};
        System.out.println("Addition = "+a2 .add(100,100));
    }
}
