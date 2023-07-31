package maven1;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;

public class CallableInsert {
public static void main(String[] args) throws Exception {
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/a1user1","root","root");
	CallableStatement callableStatement=connection.prepareCall("call insertUser(95,'adhesh','kolkata')");
	callableStatement.execute();
	connection.close();
	System.out.println("Exevuted with callable statement");
}
}
