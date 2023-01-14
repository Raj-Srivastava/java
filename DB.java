import java.sql.*;

public class DB {
public static void main(String args[]){
Connection con=null;
		try{
Class.forName("com.mysql.jdbc.Driver");
con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","");
String str="insert into t1 values(45,'BA')";
Statement st=con.createStatement();
st.execute(str);
System.out.println("Row Inserted");
		}catch(Exception e){System.out.println(e);}

System.out.println("exit from main");
}

}
