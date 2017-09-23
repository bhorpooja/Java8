package com.example.Java8Lambda;

/**
 * Created by pooja on 1/9/17.
 */
interface Info{
    String User(String name);

    default int add(int a,int b) {
        return a+b;
    }


}
public class Lambdademo2 {
    public static void main(String[] args) {
        //interface with param to method

        Info i = (name) -> {return "Hello " + name;};
        System.out.println(i.User("Pooja"));

        Info i1 = name -> {return "Hiii "+name;};
        System.out.println(i1.User("ashish"));

        System.out.println("Addition = "+i1.add(20,20));
    }
}
