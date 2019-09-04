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
   // String cpin; 
    int row;
     int i=0;
     int j=0;
     int k=0;
     int l=0;
    String p[]=new String[20];
    double  bal[]=new double[20];
    String a[]=new String[20];
   public String name[]=new String[20];
      //  String b[]=new String[20]; 
    
     public String[] db() throws SQLException
            {
               Connection con=DriverManager.getConnection("jdbc:derby://localhost:1527/customer", "root", "root");
            //  System.out.println("Connection Created !!!");
               Statement st=con.createStatement();
               ResultSet rs=st.executeQuery("select * from CUSTOMER");
              
              while(rs.next())
              {
                  a[i]=rs.getString(1);
                  i++;
              }
              return a;
                   
                  
            }

    
     public  String[] db_name() throws SQLException 
     {
        Connection con=DriverManager.getConnection("jdbc:derby://localhost:1527/customer", "root", "root");
            //  System.out.println("Connection Created !!!");
               Statement st=con.createStatement();
               ResultSet rs=st.executeQuery("select * from CUSTOMER");
              
              while(rs.next())
              {
                  name[k]=rs.getString(2);
                  k++;
              }
              return name;
        }
     public String[] db_pin() throws SQLException
            {
               Connection con=DriverManager.getConnection("jdbc:derby://localhost:1527/customer", "root", "root");
            //  System.out.println("Connection Created !!!");
               Statement st=con.createStatement();
               ResultSet rs=st.executeQuery("select * from CUSTOMER");
              
              while(rs.next())
              {
                  p[l]=rs.getString(3);
                  l++;
              }
              return p;
                   
                  
            }
     public  double[] db_bal() throws SQLException {
        Connection con=DriverManager.getConnection("jdbc:derby://localhost:1527/customer", "root", "root");
            //  System.out.println("Connection Created !!!");
               Statement st=con.createStatement();
               ResultSet rs=st.executeQuery("select * from CUSTOMER");
              
              while(rs.next())
              {
                  bal[j]=rs.getDouble(4);
                  j++;
              }
              return bal;
    }
}

        
    
   