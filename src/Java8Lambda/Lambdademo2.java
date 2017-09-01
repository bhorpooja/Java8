package Java8Lambda;

/**
 * Created by pooja on 1/9/17.
 */
interface Info{
    String User(String name);
}
public class Lambdademo2 {
    public static void main(String[] args) {
        System.out.println("interface with param to method ");
        Info i = (name) -> {return "Hello " + name;};
        System.out.println(i.User("Pooja"));

        Info i1 = name -> {return "hiii "+name;};
        System.out.println(i1.User("ashish"));

    }
}
