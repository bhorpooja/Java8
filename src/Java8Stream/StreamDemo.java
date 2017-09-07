package Java8Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by pooja on 7/9/17.
 */
class BeforeJava8{
    void beforeJava8() {
        List<String> list = Arrays.asList("pooja","priyanka","rohini","Ashu" );
        List<String> result=getFilteredOutput(list,"rohini");
        for (String res:result){
            System.out.println(res);
        }
    }

    private static List<String> getFilteredOutput(List<String> list,String filter){
        List<String> result=new ArrayList<>();
        for (String list1:list) {
            if(!"rohini".equals(list1)){
                result.add(list1);
            }
        }

        return result;
    }
}
class AfterJava8{
    void afterJava8(){
        List<String> list=Arrays.asList("pooja","priyanka","rohini","Ashu");
        List<String> result=list.stream().filter(l->!"rohini".equals(l)).collect(Collectors.toList());
        result.forEach(System.out::println);
    }
}
public class StreamDemo {
    public static void main(String[] args) {
        System.out.println("Filter list before java8");
        BeforeJava8 b=new BeforeJava8();
        b.beforeJava8();
        System.out.println("Filter list after java8");
        AfterJava8 a=new AfterJava8();
        a.afterJava8();

    }
}
