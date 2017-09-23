package com.example.Java8MethodReference.InstanceMethodReference;

/**
 * Created by pooja on 23/9/17.
 */
interface Sayable{
    void say();
}
public class ReferToNonStaticMethod {
    public void saySomething() {
        System.out.println("Reference to non-static method....");
    }

    public static void main(String[] args) {

        //non-static Method reference by class object
        ReferToNonStaticMethod ref=new ReferToNonStaticMethod();    //creating object
        Sayable s1=ref::saySomething;   //referring non-static method using reference
        s1.say();   //calling interface method

        //non-static Method reference by anonymous object
        Sayable s2=new ReferToNonStaticMethod()::saySomething; //using anonymous object also
        s2.say();    //calling interface method
    }
}
