/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author My
 */
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;
class abc {
    public abc() throws SQLException
            {
               Connection con=DriverManager.getConnection("jdbc:derby://localhost:1527/customer", "root", "root");
               System.out.println("Connection Created !!!");
            }
}
