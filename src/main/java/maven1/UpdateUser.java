package maven1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class UpdateUser {
	public static void main(String[] args) throws Exception {
//		1.Load and registering the driver
		Class.forName("com.mysql.cj.jdbc.Driver");
//		2.Create Connection
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/a1user1","root","root");
//		3.Create Statement
		Statement statement=connection.createStatement();
//		4.Execute a query
		statement.execute("update User set name='Poojitha j m' where id=1");
//		5.close the connection
		connection.close();
		System.out.println("Updated successfully");
	}

}
