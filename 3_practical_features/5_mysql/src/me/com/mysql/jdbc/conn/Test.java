package me.com.mysql.jdbc.conn;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Test {

	public static void main(String[] args) {
        Connection con = null;
        Statement st = null;
        ResultSet rs = null;

        String url = "jdbc:mysql://localhost:3306/testdb";
        String user = "username";
        String password = "passwd";
        
        try {
            con = DriverManager.getConnection(url, user, password);
            st = con.createStatement();
            rs = st.executeQuery("SELECT * FROM testtable");

            if (rs.next()) {
                System.out.println(rs.getString(1));
            }

        } catch (SQLException ex) {

        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (st != null) {
                    st.close();
                }
                if (con != null) {
                    con.close();
                }

            } catch (SQLException ex) {
            }
        }
	
	}

}
