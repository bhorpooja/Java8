package Java8Lambda;

/**
 * Created by pooja on 1/9/17.
 */
interface Test{
    void run();
}
class javaLambdaDemo {

    public static void main(String[] args) {
        System.out.println("Interface with no param to method");
        System.out.println("Use interface using anonymous inner class");
        Test t = new Test() {

            @Override
            public void run()
            {
                System.out.println("Interface run method using anonymousInnerClass");
            }
        };
        t.run();

        Test t1=()->{
            System.out.println("Interface run method using lambda exp. 1way");
        };
        t1.run();

        Test t2=()-> System.out.println("Interface run method using lambda exp. 2way");
        t2.run();

    }

}


