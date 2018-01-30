package com.example.Java8Stream;

import java.util.Arrays;
import java.util.List;

/**
 * Created by pooja on 15/12/17.
 */

class Before8{

    List<String> strings = Arrays.asList("abc", "", "xyz", "", "cd", "pqr", "lmn", "", "jk");
    Long count;
    public void getEmptyStringCount7() {

        System.out.println(strings);
        count= Long.valueOf(getEmptyCount(strings));
        System.out.println("Count of Empty Strings 7 : "+count);
    }

    public void getLength3StringCount7(){
        count=Long.valueOf(getLength3Count(strings));
        System.out.println("Count of String Length3 : "+count);
    }

    private long getLength3Count(List<String> strings) {
        int count=0;
        for (String str:strings){
            if(str.length()==3){
                count++;
            }
        }
        return count;
    }

    private static int getEmptyCount(List<String> strings) {
        int count=0;
        for(String st:strings) {
            if (st.isEmpty()) {
                count++;
            }
        }

        return count;
    }

}
class After8{

    List<String> strings = Arrays.asList("abc", "", "xyz", "", "cd", "pqr", "lmn", "", "jk");

    public void getEmptyStringCount8(){

        Long count=strings.stream().filter(s -> s.isEmpty()).count();
        System.out.println("Count of Empty Strings 8 : "+count);
    }

}
public class Java8Stream {
    public static void main(String[] args) {

        Before8 b=new Before8();
        b.getEmptyStringCount7();
        b.getLength3StringCount7();

        After8 a=new After8();
        a.getEmptyStringCount8();
    }
}
