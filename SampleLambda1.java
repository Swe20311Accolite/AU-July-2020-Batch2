import java.util.*;
public class SampleLambda1 {
    public void method()
    {
        System.out.println("Hello");
    }
    public static void method1()
    {
        System.out.println("Hello");
    }

public static void main(String[] args)
{
    SampleLambda1 l=new SampleLambda1();

//using lambda exp
    Fun flambda=()->System.out.println("Hello");
    flambda.print();
//using instance method
    Fun f1 = new SampleLambda1()::method;
     f1.print();
 //using static method
    new SampleLambda1;
    Fun f2= SampleLambda1::method1;
    f2.print();
 //using constructor
    Fun f3=a::new;
    f3.print();

}
}
class a
    a() {
        System.out.println("hello");
    }
@FunctionalInterface
public interface Fun {
    void print();
}


