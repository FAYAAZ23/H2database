
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;  
  
public class LoginDao { 
	String s;
public String isValidateUser(String uname,String pwd){  
  
try
{  
Class.forName("org.h2.Driver");  
Connection con=DriverManager.getConnection("jdbc:h2:~/test","sa","");  
      
Statement st =con.createStatement(); 
System.out.println("Connection Established successfully..");  

      
ResultSet rs=  st.executeQuery("Select *from registeruser where UNAME='"+uname+"'and PASSWORD='"+pwd+"'");  
while (rs.next()){
	s="First name:"+rs.getString(1)+"\nLast name:"+rs.getString(2)+"\nUsername:"+rs.getString(3)+"\nEmail:"+rs.getString(4);
}
 con.close();         
}
catch(Exception e)
{
	e.printStackTrace();
	}  
return s;  
}  
} 

