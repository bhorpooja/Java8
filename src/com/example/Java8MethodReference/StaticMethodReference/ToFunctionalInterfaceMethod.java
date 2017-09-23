package com.example.Java8MethodReference.StaticMethodReference;

/**
 * Created by pooja on 23/9/17.
 */
interface Sayable{
    void say();
}
public class ToFunctionalInterfaceMethod {
    //here, we  have defined functional interface Sayable....
    //& referring static method msg() to its functional method say()....
    public  static  void msg(){
        System.out.println("Say Hiiii....Hello....");
    }

    public static void main(String[] args) {

        //referring static method
        Sayable s= ToFunctionalInterfaceMethod::msg;
        //calling interface method
        s.say();
    }
}
