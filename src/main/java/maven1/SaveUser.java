package maven1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class SaveUser {
public static void main(String[] args) throws ClassNotFoundException, SQLException {
//	1.Load and Registering the driver
	Class.forName("com.mysql.cj.jdbc.Driver");
//	2.Create Connection
	Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/a1user1","root","root");
//	3.Create Statement
	Statement statement=connection.createStatement();
//	4.execute the query
	statement.execute("insert into user1 values(2,'Manochitra','Delhi')");
//	5.close the connection
	connection.close();
	System.out.println("User data inserted successfully");
}
}
