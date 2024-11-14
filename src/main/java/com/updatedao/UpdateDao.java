package com.updatedao;
import java.sql.*;
public class UpdateDao {
	String url="jdbc:mysql://localhost:3306/swarnav";
	String user="swarnav";
	String pass="swarnav";
	String sql="update book_registration set bookname=?,bookedition=?,price=? where id=?";
	public boolean UpdateBook(String name, String edition, int price,int id) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		
		Connection con = DriverManager.getConnection(url,user,pass);
		PreparedStatement st=con.prepareStatement(sql);
		
		
		st.setString(1, name);
		st.setString(2, edition);
		st.setLong(3, price);
		st.setInt(4, id);
		int i=st.executeUpdate();
		if(i>0) {
			return true;
		}
		else {
			return false;
		}
		
	}
}
