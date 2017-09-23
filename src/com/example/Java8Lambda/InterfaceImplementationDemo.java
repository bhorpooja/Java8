package com.example.Java8Lambda;

/**
 * Created by pooja on 23/9/17.
 */
interface Drawable{
    void Draw();
}
public class InterfaceImplementationDemo {
    public static void main(String[] args) {
        //interface implementation using lambda using anonymous class
        String str="Cartoon";
        Drawable d=()->{System.out.println("Drawing "+str);};
        d.Draw();
    }
}
