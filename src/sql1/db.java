/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sql1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author My
 */
public class db{
    String cpin;
     public String db() throws SQLException
            {
               Connection con=DriverManager.getConnection("jdbc:derby://localhost:1527/customer", "root", "root");
               System.out.println("Connection Created !!!");
               Statement st=con.createStatement();
               ResultSet rs=st.executeQuery("select * from CUSTOMER");
               while(rs.next())
               {
                   cpin=rs.getString(1);
                   System.out.println(rs.getString(2));
                   System.out.println(rs.getString(3));
                   System.out.println(rs.getString(4));
               }
               return cpin;
               
            }

    
}
