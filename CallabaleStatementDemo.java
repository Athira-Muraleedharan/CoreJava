import java.sql.*;
public class CallabaleStatementDemo {

	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "scott", "tiger");
			
			
			String sql="{ ? = call BIG1(?,?) }";
			CallableStatement cstmt=con.prepareCall(sql);
			
			//Register the data type for the OUT(output) parameter
			
			cstmt.registerOutParameter(1, Types.INTEGER);
			
			//Provide the IN (input) parameter values
			
			cstmt.setInt(2, 225);
			cstmt.setInt(3, 125);
			
			//Execute this SQL Function
			
			cstmt.execute();
			
				System.out.println("SQL function is executed successfully");
				System.out.println("Biggest No is " + cstmt.getInt(1)); // Read the result from dual
			
			
			//close all
			cstmt.close();
			con.close();
		}
		catch (ClassNotFoundException cnf) {
			System.out.println("Class not Found");
			System.out.println(cnf.getMessage());
		}
		catch(SQLException se) {
			System.out.println("SQL syntax error");
			System.out.println(se.getMessage());
			String msg=se.getMessage();
			if(msg.equals("ORA-06550"))
				System.out.println("The function must be declared");
			
		}
		
	}

}
