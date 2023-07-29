package maven1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Scanner;

public class PreparedStatement {
public static void main(String[] args) throws Exception {
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/a1user1","root","root");
	java.sql.PreparedStatement preparedStatement=connection.prepareStatement("insert into user values(?,?,?)");
	int i=0;
	while(i<1) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Please enter id");
		int id=scanner.nextInt();
		System.out.println("please enter name");
		String name=scanner.next();
		System.out.println("please enter address");
		String address=scanner.next();
		preparedStatement.setInt(1, id);
		preparedStatement.setString(2, name);
		preparedStatement.setString(3, address);
		preparedStatement.execute();
		i++;
	}
	connection.close();
	System.out.println("data inserted with the help of your preparedstatement by taking user input");
	
	
}
}
