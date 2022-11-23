package jdbcconnectivity;

import java.sql.*;

public class jdbc {
    public static void main(String args[]) {

        try {
            // step1 load the driver class
            Class.forName("oracle.jdbc.driver.OracleDriver");

            // step2 create the connection object
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "Aniket0156");

            // step3 create the statement object
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("select name from flights");
            System.out.println("connection successful");
            while (rs.next())
                System.out.println(rs.getString(1));

            // step5 close the connection object
            con.close();

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }

    }
}