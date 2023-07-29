package maven1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class ExecuteUpdate {
public static void main(String[] args) throws Exception {
//	Class.forName("com.mysql.cj.jdbc.Driver");
//	Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/a1user1","root","root");
//	Statement statement=connection.createStatement();
//	int value=statement.executeUpdate("insert into user values(10,'upeksha','mumbai')");
//	System.out.println(value);
//	connection.close();
//	Class.forName("com.mysql.cj.jdbc.Driver");
//	Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/a1user1","root","root");
//	Statement statement=connection.createStatement();
//	int value=statement.executeUpdate("update user set name='upekshaaaa' where id=10");
//	System.out.println(value);
//	connection.close();
//	
//	
//	Class.forName("com.mysql.cj.jdbc.Driver");
//	Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/a1user1","root","root");
//	Statement statement=connection.createStatement();
//	int value=statement.executeUpdate("delete from User where id=10");
//	System.out.println(value);
//	connection.close();
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/a1user1","root","root");
	Statement statement=connection.createStatement();
	int value=statement.executeUpdate("select user from user where id=1");
	System.out.println(value);
	connection.close();
}
}
