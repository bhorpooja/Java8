package com.example.Java8Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
    * Created by pooja on 1/9/17.
 */
class Demo {
    List<Student> get()
    {
         List<Student> list = new ArrayList<Student>();
        // Student s=new Student();
         Student s1 = new Student();
         s1.setId(1);
         s1.setName("pooja");
         s1.setClg("svcet");
         s1.setAge(23);

         Student  s2=new Student();
         s2.setId(2);
         s2.setName("ashish");
         s2.setAge(20);
         s2.setClg("coep");

         list.add(s1);
         list.add(s2);
          return list;
    }
    void check()
    {
        List<Student> list1= get();
        System.out.println("sorting list using java collection comparator");
        System.out.println("Before Sort");
        System.out.println(list1);
        Collections.sort(list1, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getAge()-o2.getAge();
            }
        });
        System.out.println("After Sort");
        System.out.println(list1);
    }

    void check1(){
        List<Student> list2=get();
        System.out.println("sorting list using java8 lambda expression");
        System.out.println("Before Sort");
        System.out.println(list2);
        System.out.println("ONE WAY : ");
        Collections.sort(list2, (o1, o2) -> o1.getAge()-o2.getAge());
        System.out.println("After Sort");
        System.out.println(list2);

        System.out.println("SECOND WAY : ");
        list2.sort((o1, o2) -> o1.getAge()-o2.getAge());
        System.out.println(list2);
    }

    void javaFor(){
        List<Student> list2=get();
        System.out.println("print list using forEach loop");
        System.out.println(list2);
        for (Student s:list2) {
            System.out.println(s.getId() + " " + s.getName() + "  " + s.getAge() + " " + s.getClg());
        }
        System.out.println("print list using lambda exp");
        list2.forEach(s -> System.out.println(s));
       list2.forEach(s -> System.out.println(s.getId()+" "+s.getName()+" "+s.getAge()+" "+s.getClg()));

        }
    }

public class ComparatroDemo {
    public static void main(String[] args) {
        Demo d=new Demo();
       d.check();
       //d.check1();
       //d.javaFor();

    }
}
