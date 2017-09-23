package com.example.Java8Lambda;

/**
 * Created by pooja on 23/9/17.
 */
interface Arithmatic{
    int operation(int a,int b);
}
public class ReturnTypeDemo {
    public static void main(String[] args) {
        //interface implementation using lambda with multiple parameter
        //with use of return type
        Arithmatic a1=(a,b)->{return a+b;};
        System.out.println("Addition : "+a1.operation(10,10));

        //without using return type
        Arithmatic a2=(int a,int b)->(a*b);
        System.out.println("Multiplication : "+a2.operation(10,10));
    }
}
