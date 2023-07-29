package maven1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

import com.mysql.cj.jdbc.Driver;

public class PreparedStatementDelete {
public static void main(String[] args) throws Exception {
	Driver driver=new Driver();
	DriverManager.registerDriver(driver);
	Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/a1user1", "root", "root");
	PreparedStatement preparedStatement = connection.prepareStatement("delete user from user where id=?");
	System.out.println("please enter id to be deleted");
	int id=new Scanner(System.in).nextInt();
	preparedStatement.setInt(1, id);
	preparedStatement.execute();
	connection.close();
	System.out.println("Successfully deleted with the help of preparedstatement");
}
}
