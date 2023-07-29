package maven1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class LoadAndReg {
public static void main(String[] args) throws Exception {
//	1 a.Load the driver
	Driver driver=new Driver();
//	b.Registering the driver
	DriverManager.registerDriver(driver);
//	2.create connection
	Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/a1user1","root","root");
//	3.create Statement
	Statement statement=connection.createStatement();
//	4.execute query
	statement.execute("insert into User values(5,'mani','Hyderbad')");
//	5.Close the connection
	connection.close();
	System.out.println("Yes successfully done with loading and registering the driver explicitly");
}
}
