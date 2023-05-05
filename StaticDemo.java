import java.util.*;
class StaticBlock
{
    static int x;
    int y;
    static
    {
        x=10;
    }
    static void dispStatic()
    {
        System.out.println(x);
    }
    StaticBlock()
    {
        y=0;
        x++;
    }
    StaticBlock(int y)
    {
        this.y=y;
        x++;
    }
    void disp()
    {
        System.out.println(y);
        System.out.println(x);
    }
}
public class StaticDemo
{
    public static void main(String[] args)
    {
        StaticBlock.dispStatic();
        System.out.println(StaticBlock.x);
        StaticBlock s1=new StaticBlock();
        s1.disp();
        StaticBlock s2=new StaticBlock();
        s2.disp();
    }
}