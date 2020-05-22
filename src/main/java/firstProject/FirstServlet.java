package firstProject;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mysql.cj.jdbc.PreparedStatement;

public class FirstServlet extends  HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		Connection conn;
		ResultSet rs = null;
		PreparedStatement prpPreparedStatement = null;
		PrintWriter printWriter = null;
		StringBuffer sql = new StringBuffer(1024);
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			conn =  DriverManager.getConnection("jdbc:mysql://localhost:3306/puzzle?user=root&password=root");
			
			 sql.append("Select * from user_info");
			 
			 prpPreparedStatement = (PreparedStatement) conn.prepareStatement(sql.toString());
			 
			 rs = prpPreparedStatement.executeQuery();
			  printWriter = resp.getWriter();
			 
			 while (rs.next()) {
				 
				 String name = rs.getString("name");
				 
				 System.out.println("Name" + name);
				 
					
					
					printWriter.write( name );
					printWriter.write("<br>");
					printWriter.write(rs.getString("email") );
					printWriter.write("<br>");

			 }
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
		
			printWriter.close();
		}
		
	
		
		
		
	}

}
