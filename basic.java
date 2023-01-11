import java.io.*;
class A
{
    public static void main(String args[])
    {
        Console c=System.console();
        int n1=Integer.parseInt(c.readLine("Enter First Number:"));
        int n2=Integer.parseInt(c.readLine("Enter First Number:"));
        int sum=n1+n2;
        System.out.println(sum);
    }
}