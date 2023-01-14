import java.io.*;
class table
{
    public static void main(String args[])
    {
        Console c=System.console();
        int t=Integer.parseInt(c.readLine("Enter Number you want to print table:"));
        for(int i=1;i<=10;i++)
        {
            System.out.println(t*i);
        }
    }
}