package maven1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class GetConnectionConecpt {
public static void main(String[] args) throws Exception {
	Driver driver=new Driver();
	DriverManager.registerDriver(driver);
    Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/a1user1?user=root&password=root");
    Statement statement=connection.createStatement();
    statement.execute("insert into user values(124,'siva','Chennai')");
    connection.close();
    System.out.println("Successfully used getconnection single parameter method");
}
}
