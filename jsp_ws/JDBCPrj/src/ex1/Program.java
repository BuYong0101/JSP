package ex1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Program {

	public static void main(String[] args) {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection(url, "scott", "tiger");
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(sql);
		
		rs.close();
		st.close();
		con.close();

	}

}
