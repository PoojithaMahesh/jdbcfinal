package maven1;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CallableSelect {
public static void main(String[] args) throws Exception {
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/a1user1","root","root");
	CallableStatement callableStatement=connection.prepareCall("call selectUser(?)");
	callableStatement.setInt(1, 1000);
	ResultSet resultSet=callableStatement.executeQuery();
	while(resultSet.next()) {
		System.out.println(resultSet.getInt(1));
		System.out.println(resultSet.getString(2));
		System.out.println(resultSet.getString(3));
	}
	System.out.println("yes successfully fetched with the selectUser stored procedure");
}
}
