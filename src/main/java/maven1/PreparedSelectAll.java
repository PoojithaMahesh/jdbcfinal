package maven1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import com.mysql.cj.jdbc.Driver;

public class PreparedSelectAll {
public static void main(String[] args) throws Exception {
	Driver driver=new Driver();
	DriverManager.registerDriver(driver);
	Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/a1user1","root","root");
	PreparedStatement preparedStatement=connection.prepareStatement("select * from user");
	
//	4.execute the query
	ResultSet resultSet=preparedStatement.executeQuery();
	int i=0;
	while(resultSet.next()) {
		if(i>=3&&i<6) {
			System.out.println(resultSet.getInt("id"));
			System.out.println(resultSet.getString("name"));
			System.out.println(resultSet.getString("address"));
		}
		i++;
		
	}
	connection.close();
	System.out.println("Yes executed");
}
}

