package maven1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class PreparedUpdate {
	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/a1user1", "root", "root");
		PreparedStatement preparedStatement = connection.prepareStatement("update user set name='Poojitha' where id=?");
		int id=new Scanner(System.in).nextInt();
		preparedStatement.setInt(1, id);
		preparedStatement.execute();
		connection.close();
		System.out.println("Successfully updated with the help of preparedstatement");
	}
}
