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
public class db_bal {
     int row;
    int i=0;
    String a[]=new String[20]; 
    
     public String[] db_bal() throws SQLException
            {
               Connection con=DriverManager.getConnection("jdbc:derby://localhost:1527/customer", "root", "root");
            //  System.out.println("Connection Created !!!");
               Statement st=con.createStatement();
               ResultSet rs=st.executeQuery("select * from CUSTOMER");
              
              while(rs.next())
              {
                  a[i]=rs.getString(4);
                  i++;
              }
              return a;
    
            }
}
