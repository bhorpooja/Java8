package com.example.Java8Lambda;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by pooja on 23/9/17.
 */
public class ForEachLoopDemo {
    public static void main(String[] args) {

        List<String> list=new ArrayList<>();
        list.add("Pooja");
        list.add("Shraddha");
        list.add("Pradnya");
        list.add("Vaibhav");
        list.add("Rajkumar");
        list.add("Omkar");

        //traversing list using lambda using forEach Loop
        list.forEach(n-> System.out.println(n));
    }
}
