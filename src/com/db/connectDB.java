/*TODO
*  - 23/03/2021
*       Test inserting data to the database*/

package com.db;

import javax.swing.plaf.nimbus.State;
import java.sql.*;

public class connectDB {
    public static void main(String[] args) {

        String query = "SELECT * FROM users_info";

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/reflexusers",
                    "root", "");

            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(query);

            while(rs.next()){
                System.out.println(rs.getInt(1));
                System.out.println(rs.getString(2));
                System.out.println(rs.getString(3));
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
