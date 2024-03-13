package org.edu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Practice {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection c = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr", "8667767517");
		String s = "select * from employees";
		PreparedStatement ps = c.prepareStatement(s);
		ResultSet rs = ps.executeQuery();
		while (rs.next()) {
			String string = rs.getString("salary");
			System.out.println(string);
		}
		c.close();
	}
}
