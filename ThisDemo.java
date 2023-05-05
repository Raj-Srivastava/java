/*This Program is using this in java*/
import java.util.*;
public class ThisDemo
{
    public static void main(String[] args)
    {
        Abc o1=new Abc();               //new is use to create object
        Abc o2=new Abc(30,40);          //Abc is class where we define the function
        Abc o3=new Abc(o2);             //Passing object 2 that is o2 as patrameter
        o1.print1();
        o2.print1();
        o3.print1();
    }
}
class Abc
{
    int a;                  //This is instance Variable
    int b;                  //This is instance Variable
    Abc()
    {
        a=b=0;
    }
    Abc(int a,int b)
    {
        this.a=a;           //This Line point at instance variable a by using this.a 
        this.b=b;           //This Line point at instance variable b by using this.b
    }
    Abc(Abc o)              //Here object as parameter using Abc class
    {
        a=o.a;
        b=o.b;
    }
    void print1()
    {
        System.out.println(a+" "+b);
    }
}