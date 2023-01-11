import java.io.*;
class calc
{
    public static void main(String args[])
    {
        Console c=System.console();
        int add=0;
        for(int i=1;i>0;i++)
        {
            int num1=Integer.parseInt(c.readLine("Enter First Number:"));
            String operator=c.readLine("");
            switch(operator)
            {
                case "+":
                add=num1+add;
                System.out.println(add);
                break;
                case "=":
                break;
                default:
                System.out.println("enter Correct number");
                break;
            }
            if(operator=="=")
            {
                break;
            }
        }
    }
}