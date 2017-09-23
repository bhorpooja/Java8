package com.example.Java8Lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by pooja on 23/9/17.
 */
class Student{
    int id;
    String name;
    String city;
    float percent;
    Student(int id,String name,String city,float percent){
        super();
        this.id=id;
        this.name=name;
        this.city=city;
        this.percent=percent;
    }
}
public class ComparatorExample {
    public static void main(String[] args) {
        List<Student> list=new ArrayList<>();

        //adding element to list
        list.add(new Student(3,"Pooja","Pune",65.67f));
        list.add(new Student(4,"Shraddha","Mumbai",67.89f));
        list.add(new Student(1,"Pradnya","Nashik",60.78f));
        list.add(new Student(2,"Priyanka","Nagpur",78.80f));
        System.out.println("Sorting list on basis of id without using Java8");
        //sorting list on the basis of id without using java8
        Collections.sort(list, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.id-o2.id;
            }
        });

        //after sorting list
        for (Student s:list) {
            System.out.println(s.id+" "+s.name+" "+s.city+" "+s.percent);
        }

        System.out.println("\nSorting list on basis of name using Java8");
        //sorting list on the basis of id using java8
        Collections.sort(list,(s1,s2)->{return s1.name.compareTo(s2.name);});

        //after sorting list
        list.forEach(s -> {
            System.out.println(s.id+" "+s.name+" "+s.city+" "+s.percent);
        });


    }
}
