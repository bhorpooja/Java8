package com.example.Java8MethodReference.ConstructorReference;

/**
 * Created by pooja on 23/9/17.
 */
interface Massageable{
    public void getMsg(String msg);
}
class Message{
    public Message(String msg){
        System.out.println(msg);
    }
}
public class ConstructorReferenceDemo {

     //We can refer a constructor by using the new keyword.
     //Here, we are referring constructor with the help of functional interface.

    public static void main(String[] args) {
        Massageable m=Message::new;
        m.getMsg("Hey....Hiiii....");
    }
}
