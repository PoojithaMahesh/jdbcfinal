package maven1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DeleteUser {
	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/a1user1","root","root");
		Statement statement=connection.createStatement();
		statement.execute("delete from User where id=2");
		connection.close();
		System.out.println("deleted successfully");
	}
}
