package Java8Comparator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by pooja on 2/9/17.
 */
class MapDemo{
    void getMap(){
        Map<String,Integer> map=new HashMap<>();
        map.put("A",10);
        map.put("B",20);
        map.put("C",30);
        map.put("D",40);
        map.put("E",50);

        //iterating map using Map.Entry interface
//        for (Map.Entry e:map.entrySet()){
//            System.out.println(e.getKey()+" "+e.getValue());
//        }

        //iterating map using java8 lambda exp.
 //       map.forEach((k,v)-> System.out.println("Key : "+k+" Value : "+v));

        //iterate map to get only specified key-value mapping based on condition
        for (Map.Entry e:map.entrySet()){
          // System.out.println(e.getKey()+" "+e.getValue());
           if("C".equals(e.getKey()))
               System.out.println("Count : "+e.getValue());
        }

        //iterate map to get only specified key-value mapping based on condition using lambda exp
       map.forEach((k,v)-> {
          // System.out.println(k+" "+v);
            if("C".equals(k))
                System.out.println("Count : "+v);
        });

    }

    List<Student> getList(){
        List<Student> list=new ArrayList<>();
        Student s1=new Student();
        s1.setId(1);
        s1.setName("pooja");
        s1.setAge(24);
        s1.setClg("svcet");

        Student s2=new Student();
        s2.setId(2);
        s2.setName("rani");
        s2.setAge(25);
        s2.setClg("gpa");
        list.add(s1);
        list.add(s2);
        return list;
    }
    void printList(){
        List<Student> list1=getList();
        Map<String,List<Student>> map=new HashMap<>();
        map.put("abc",list1);
        //iterate map of list of object sing Map.Entry Interface
//        for (Map.Entry<String,List<Student>> e:map.entrySet()){
//            List<Student> ss=e.getValue();
//            for (Student s:ss){
//                System.out.println(e.getKey()+" "+s.getId()+" "+s.getName()+" "+s.getAge()+" "+s.getClg());
//            }
//        }

        //iterating map of list of object using lambda exp.
        map.forEach(( k,list ) -> {
            list.forEach(ss -> System.out.println(k+" "+ss.getId()+" "+ss.getName()+" "+ss.getAge()+" "+ss.getClg()));
        });
    }
}
public class java8MapDemo {
    public static void main(String[] args) {
        MapDemo m=new MapDemo();
       // m.getMap();
        m.printList();
    }
}
