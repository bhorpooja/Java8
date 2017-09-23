package com.example.Java8Comparator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by pooja on 2/9/17.
 */
class ListDemo{

    void getList(){
        List<String> list=new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");
        System.out.println(list);
        //iterate list to get specified element based on condition using forEach
//        for(String s:list){
//            System.out.println(s);
//            if ("C".equals(s)){
//                System.out.println("True");
//            }
//        }
        //iterate list to get specified element based on condition using lambda exp
        list.forEach(s ->{System.out.println(s);
        if("c".equalsIgnoreCase(s))
            System.out.println("True");});

    }
    Map<String,Student> getMap(){
        Map<String,Student> map=new HashMap<>();
        Student s1=new Student();
        s1.setId(1);
        s1.setName("ram");
        s1.setAge(20);
        s1.setClg("pccoe");
        map.put("abc",s1);

        Student s2=new Student();
        s2.setId(2);
        s2.setName("sita");
        s2.setAge(22);
        s2.setClg("gcoea");
        map.put("xyz",s2);
        return map;
    }
    void printMap(){
        Map<String,Student> map1=getMap();
        List<Map<String,Student>> list=new ArrayList<>();
        list.add(map1);
        System.out.println(list);

        //iterate list of map of objects Map.Entry Interface
//        for (Map<String,Student> m:list) {
//            for (Map.Entry<String,Student> w:m.entrySet()) {
//                // String key=w.getKey();
//                Student a=w.getValue();
//                System.out.println(w.getKey()+" "+a.getId()+" "+a.getName()+" "+a.getAge()+" "+a.getClg());
//
//                //System.out.println(w.getKey()+" "+w.getValue());
//            }
//        }

        //iterate list of map of objects using lambda
        list.forEach(map -> {
            map1.forEach((k,s)-> System.out.println(k+" "+s.getId()+" "+s.getName()+" "+s.getAge()+" "+s.getClg()));
        });

        //iterate map of object
        map1.forEach(( k,s)-> System.out.println(k+" "+s.getId()+" "+s.getName()+" "+s.getAge()+" "+s.getClg()));
    }
}
public class java8ListDemo {
    public static void main(String[] args) {
       ListDemo l=new ListDemo();
       l.getList();
        //l.printMap();
    }
}
