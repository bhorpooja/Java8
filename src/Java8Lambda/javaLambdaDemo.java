package Java8Lambda;

import static sun.misc.PostVMInitHook.run;

/**
 * Created by pooja on 1/9/17.
 */
interface Test{
    void run();
    //String disp(String nm);
}
abstract class javaLambdaDemo implements Test{

    public static void main(String[] args) {
        //Interface with no param to method"
        //Use interface using anonymous inner class
        Test t = new Test() {
            @Override
            public void run()
            {
                System.out.println("Interface run method using anonymousInnerClass");
            }
        };
        t.run();

        //override interface method using java8 lambda exp
        Test t1=()->{
            System.out.println("Interface run method using lambda exp. 1st way");
        };
        t1.run();

        Test t2=()-> System.out.println("Interface run method using lambda exp. 2nd way");
        t2.run();

    }

}


