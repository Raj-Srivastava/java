import java.util.*;
public class OverloadDemo
{
    public static void main(String[] args)
    {
        Abc o1=new Abc();
        o1.test();
        o1.test(10);
        o1.test(10.53);
        o1.test(o1);
    }
}
class Abc
{
    void test()
    {
        System.out.println("Without parameter");
    }
    void test(int a)
    {
        System.out.println("With Integer parameter");
    }
    void test(double a)
    {
        System.out.println("With Double parameter");
    }
    void test(Abc o)
    {
        System.out.println("With object as a parameter");
    }
}