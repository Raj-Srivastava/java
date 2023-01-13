import java.io.*;
class reverse
{
    public static void main(String args[])
    {
        Console c=System.console();
        String s=c.readLine("Enter Number which you want to reverse:");
        int n=Integer.parseInt(s);
        int a;
        for(int i=0;i<n;i++)
        {
            if(n!=0)
            {
                a=n%10;
                n=n/10;
                System.out.print(a);
            }
            else
            {
                break;
            }
        }
    }
}