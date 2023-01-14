import java.sql.*;

public class DB1 
{
	public static void main(String args[])
	{
		Connection con=null;
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","");
			System.out.println("connection successfull");
		}
		catch(Exception e){System.out.println(e);}
		System.out.println("dsfdsf");
	}
}
