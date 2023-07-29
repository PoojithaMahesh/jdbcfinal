package maven1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import com.mysql.cj.jdbc.Driver;

public class PreparedSelect {
public static void main(String[] args) throws Exception {
	Driver driver=new Driver();
	DriverManager.registerDriver(driver);
	Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/a1user1","root","root");
	PreparedStatement preparedStatement=connection.prepareStatement("select * from user where id=?");
	System.out.println("enter id to be selected");
	int id=new Scanner(System.in).nextInt();
	preparedStatement.setInt(1, id);
//	4.execute the query
	ResultSet resultSet=preparedStatement.executeQuery();
	while(resultSet.next()) {
		System.out.println(resultSet.getInt("id"));
		System.out.println(resultSet.getString("name"));
		System.out.println(resultSet.getString("address"));
		
	}
	connection.close();
	System.out.println("Yes executed");
}
}
