package maven1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

import com.mysql.cj.jdbc.Driver;

public class BatchExecution {
	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/a1user1?user=root&password=root");
		PreparedStatement preparedStatement = connection.prepareStatement("insert into user values(?,?,?)");
		int i = 0;
		while (i < 3) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("id");
			int id = scanner.nextInt();
			System.out.println("name");
			String name = scanner.next();
			System.out.println("address");
			String address = scanner.next();
			preparedStatement.setInt(1, id);
			preparedStatement.setString(2, name);
			preparedStatement.setString(3, address);
			preparedStatement.addBatch();
			System.out.println("Addedto batch");
			i++;
		}

		preparedStatement.executeBatch();
		connection.close();
		System.out.println("Batch execution done");
	}

}
