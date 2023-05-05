import java.util.*;
class Room
{
    int roomno;
    String roomtype,roomarea,acmachine;
    void setData()
    {
        Scanner input=new Scanner(System.in);
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Room Number:");
        roomno=input.nextInt();
        System.out.print("Enter Room Type:");
        roomtype=sc.nextLine();
        System.out.print("Enter Room Area:");
        roomarea=sc.nextLine();
        System.out.print("Enter AC Machine:");
        acmachine=sc.nextLine();
    }
    void displayData()
    {
        System.out.println("Room Number is "+roomno);
        System.out.println("Room Type is "+roomtype);
        System.out.println("RoomArea is "+roomarea);
        System.out.println("Number of Ac Machine is "+acmachine);
    }
}
public class RoomDemo
{
    public static void main(String[] args)
    {
        Room r=new Room();
        r.setData();
        r.displayData();
    }
}