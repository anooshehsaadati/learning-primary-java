package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBCIntro {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/customer_account";
        String username = "root";
        String password = "";
//        String query = "select username from student where user_id=1";
        String query = "select * from student";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(url, username, password);
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query);

            while (rs.next()) {
                int id = rs.getInt("user_id");
                String name = rs.getString("username");
                System.out.println(id + " : " + name);
            }

            st.close();
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
