/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Minggu0205;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 *
 * @author achmadi
 */
public class MyDbEmployee {

    static String URL = "jdbc:mysql://localhost/praxis";

    public static void main(String[] args) {
        try {
//        Class.forName("com.mysql.jdbc.Driver");
//        Class.forName("mariadb-java-client");

            Connection conn = DriverManager.getConnection(URL, "root", "secret");
        Statement trunc = conn.createStatement();
        trunc.executeUpdate("truncate EMPLOYEE");
            for (int i = 0; i < 10; i++) {
                Statement stmt = conn.createStatement();
                Number salary = 1000;
                String sql = "INSERT INTO `EMPLOYEE` (  `first_name`, `last_name`, `salary` ) VALUES( 'FirstName_" + i + "', 'employeeEnd', '"+salary+"' )";
                stmt.executeUpdate(sql);
            }
//        String sql = "INSERT INTO `EMPLOYEE` (  `first_name`, `last_name`, `salary` ) VALUES( 'Employee2', 'employeeEnd', '2000' )";
//        stmt.executeUpdate(sql);

            System.out.println("Inserted records into the table...");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
